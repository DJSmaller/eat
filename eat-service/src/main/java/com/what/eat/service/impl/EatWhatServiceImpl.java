package com.what.eat.service.impl;

import com.what.eat.dao.mapper.FoodListMapper;
import com.what.eat.domain.dto.EatWhatDto;
import com.what.eat.domain.entity.FoodListEntity;
import com.what.eat.service.EatWhatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author dubaolong
 * @Date 2019/2/3 10:33 AM
 * @PackageName com.what.eat.service.impl
 */
@Service
public class EatWhatServiceImpl implements EatWhatService {


    private static final Logger logger = LoggerFactory.getLogger(EatWhatServiceImpl.class);

    @Autowired
    private FoodListMapper foodListMapper;

    @Override
    public FoodListEntity getEatWhat(EatWhatDto eatWhatDto) {
        //  2019/2/9 根据选择吃饭的人数，随机出来的最优结果
        FoodListEntity peopleChooseEntity = new FoodListEntity();
        peopleChooseResult(eatWhatDto, peopleChooseEntity);
        // 2019/2/9  根据季节相关权重，随机出一个最优结果
        FoodListEntity seasonChooseEntity = new FoodListEntity();
        List<FoodListEntity> entityList = foodListMapper.selectExceptTasteAndBelief(eatWhatDto.getDiet(), eatWhatDto.getBeliefFood());
        seasonChooseResult(entityList, seasonChooseEntity);
        //  2019/2/9 根据地域相关，随机选出一个最优结果 暂时不用
        FoodListEntity areaChooseEntity = new FoodListEntity();
        // 2019/2/9 根据早中晚饭不同，随机选出一个最优结果
        FoodListEntity timeChooseEntity = new FoodListEntity();
        timeChooseResult(entityList, timeChooseEntity);
        Map<FoodListEntity, Integer> map = new HashMap<>();
        FoodListEntity resultEntity = new FoodListEntity();

        map.put(peopleChooseEntity,3);
        map.put(timeChooseEntity,2);
        map.put(seasonChooseEntity,1);
        randomSelection(map,resultEntity);
        return resultEntity;
    }

    @Override
    public String modifyEatWhat(EatWhatDto eatWhatDto) {
        return null;
    }

    private void timeChooseResult(List<FoodListEntity> entityList, FoodListEntity timeChooseEntity) {
        // 2019/2/9  获取系统时间 推算季节  春季为3-5月,夏季为6-8月、秋季为9-11月、冬季为12-2月
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        Map<FoodListEntity, Integer> map = new HashMap<>();
        for (FoodListEntity entity : entityList) {
            if (hour >= 5 && hour <= 10) {
//                早餐
                map.put(entity, Math.toIntExact(entity.getMorningPeopleChoose()));
                break;
            } else if (hour >= 11 && hour <= 14) {
//                午餐
                map.put(entity, Math.toIntExact(entity.getNoonPeopleChoose()));
                break;

            } else if (hour >= 17 && hour <= 21) {
//                晚餐
                map.put(entity, Math.toIntExact(entity.getDinnerPeopleChoose()));
                break;

            }
            if (entityList != null && entityList.size() > 0) {
                randomSelection(map, timeChooseEntity);
            }
        }
    }
    private void peopleChooseResult(EatWhatDto eatWhatDto, FoodListEntity peopleChooseEntity) {
        List<FoodListEntity> entityList = foodListMapper.selectExceptTasteAndBeliefWithNum(
                eatWhatDto.getDiet(),
                eatWhatDto.getBeliefFood(),
                eatWhatDto.getPeopleNum());
        //  2019/2/8 多级权重筛选算法 就是根据吃的食物相关性的相关程度，按照顺序进行权重随机筛选
        Map<FoodListEntity, Integer> map = new HashMap<>();
        for (FoodListEntity entity : entityList) {
            if (entity.getFoodNum() == 0) {
                map.put(entity, Math.toIntExact(entity.getOnePeopleChoose()) + Math.toIntExact(entity.getMorePeopleChoose()));
            } else if (entity.getFoodNum() == 1) {
                map.put(entity, Math.toIntExact(entity.getOnePeopleChoose()));
            } else {
                map.put(entity, Math.toIntExact(entity.getMorePeopleChoose()));
            }
        }
        if (entityList != null && entityList.size() > 0) {
            randomSelection(map, peopleChooseEntity);
        }
    }

    private void seasonChooseResult(List<FoodListEntity> entityList, FoodListEntity seasonChooseEntity) {
        // 2019/2/9  获取系统时间 推算季节  春季为3-5月,夏季为6-8月、秋季为9-11月、冬季为12-2月
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        Map<FoodListEntity, Integer> map = new HashMap<>();
        for (FoodListEntity entity : entityList) {
            switch (month) {
                case 3:
                case 4:
                case 5:
                    logger.info("#### 当前为 春天");
                    map.put(entity, Math.toIntExact(entity.getSpringPeopleChoose()));
                    break;
                case 6:
                case 7:
                case 8:
                    logger.info("#### 当前为 夏天");
                    map.put(entity, Math.toIntExact(entity.getSummerPeopleChoose()));
                    break;
                case 9:
                case 10:
                case 11:
                    logger.info("#### 当前为 秋天");
                    map.put(entity, Math.toIntExact(entity.getAutumnPeopleChoose()));
                case 12:
                case 1:
                case 2:
                    logger.info("#### 当前为 冬天");
                    map.put(entity, Math.toIntExact(entity.getWinterPeopleChoose()));
                default:
                    break;
            }
            if (entityList != null && entityList.size() > 0) {
                randomSelection(map, seasonChooseEntity);
            }
        }
    }

    private void randomSelection(Map<FoodListEntity, Integer> map, FoodListEntity entity) {
        // 在这里选出一个
        Integer sum = map.values().parallelStream().reduce(Integer::sum).get();
        Integer random = new Random().nextInt(sum);

        for (FoodListEntity foodListEntity : map.keySet()) {
            int weight = map.get(foodListEntity);
            if (random > weight) {
                random -= weight;
            } else {
                BeanUtils.copyProperties(foodListEntity, entity);
                break;
            }
        }
    }


    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        System.out.println(hour);
    }
}
