package com.what.eat.dao.mapper;

import com.what.eat.domain.entity.FoodListEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodListMapper {

    int insert(FoodListEntity record);

    int insertSelective(FoodListEntity record);

    FoodListEntity selectByPrimaryKey(Long foodId);

    List<FoodListEntity> selectExceptTasteAndBeliefWithNum(@Param("taste") String taste, @Param("beliefToEat") String beliefToEat,@Param("foodNum") Integer foodNum);

    List<FoodListEntity> selectExceptTasteAndBelief(@Param("taste") String taste, @Param("beliefToEat") String beliefToEat);

    int updateByPrimaryKeySelective(FoodListEntity record);

    int updateByPrimaryKey(FoodListEntity record);
}