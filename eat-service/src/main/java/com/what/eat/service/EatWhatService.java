package com.what.eat.service;


import com.what.eat.domain.dto.EatWhatDto;
import com.what.eat.domain.entity.FoodListEntity;

/**
 * @Author dubaolong
 * @Date 2019/2/3 10:32 AM
 * @PackageName com.what.eat.service
 */
public interface EatWhatService {

    /**
     * 拿到需要吃的食物
     * @return
     */
    public FoodListEntity getEatWhat(EatWhatDto eatWhatDto);

    /**
     * 选择之后更新选择次数
     * @param eatWhatDto
     * @return
     */
    public String modifyEatWhat(EatWhatDto eatWhatDto);


}
