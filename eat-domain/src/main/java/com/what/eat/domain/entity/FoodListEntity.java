package com.what.eat.domain.entity;

import java.io.Serializable;

/**
 * food_list
 * @author 
 */
public class FoodListEntity implements Serializable {
    /**
     * 食物ID
     */
    private Long foodId;

    /**
     * 食物名称
     */
    private String foodName;

    /**
     * 食物类型 枚举：主食（STAPLE）、菜(DISH)、其他(OTHER)
     */
    private String foodType;

    /**
     * 吃东西的人数
     */
    private Integer foodNum;

    /**
     * 食物最适合吃的人群 枚举：家人（FAMILY）、情侣（COUPLE）、朋友（FRIEND）
     */
    private String crowd;

    /**
     * 季节 枚举：SPRING、SUMMER、AUTUMN、WINTER
     */
    private String season;

    /**
     *  适合吃的地域 枚举：NORTH、SOUTH
     */
    private String placeToEat;

    /**
     *  食物最适合吃的时间 枚举：MORNING、NOON、DINNER
     */
    private String timeToEat;

    /**
     *  食物的信仰禁忌  普通/回族/猪肉/牛羊肉 枚举：NORMAL
     */
    private String beliefToEat;

    /**
     * 口味 枚举：油腻 GREASE、辛辣 SPICY 、清淡 LIGHT
     */
    private String taste;

    /**
     * 食物的成本
     */
    private String foodPrice;

    /**
     * 食物常规做法的链接
     */
    private String foodLink;

    /**
     * 是否适合点外卖
     */
    private String takeOutFood;

    /**
     * 人数为一的时候食物选择的次数
     */
    private Long onePeopleChoose;

    /**
     * 人数为多人的时候食物选择的次数
     */
    private Long morePeopleChoose;

    /**
     * 春天时选择的次数
     */
    private Long springPeopleChoose;

    /**
     * 夏天时选择的次数
     */
    private Long summerPeopleChoose;

    /**
     * 秋天时选择的次数
     */
    private Long autumnPeopleChoose;

    /**
     * 冬天时选择的次数
     */
    private Long winterPeopleChoose;

    /**
     * 北方人选择的次数
     */
    private Long northPeopleChoose;

    /**
     * 南方人选择的次数
     */
    private Long southPeopleChoose;

    /**
     * 早餐选择的次数
     */
    private Long morningPeopleChoose;

    /**
     * 午餐选择的次数
     */
    private Long noonPeopleChoose;

    /**
     * 晚餐选择的次数
     */
    private Long dinnerPeopleChoose;

    private static final long serialVersionUID = 1L;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Integer getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(Integer foodNum) {
        this.foodNum = foodNum;
    }

    public String getCrowd() {
        return crowd;
    }

    public void setCrowd(String crowd) {
        this.crowd = crowd;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPlaceToEat() {
        return placeToEat;
    }

    public void setPlaceToEat(String placeToEat) {
        this.placeToEat = placeToEat;
    }

    public String getTimeToEat() {
        return timeToEat;
    }

    public void setTimeToEat(String timeToEat) {
        this.timeToEat = timeToEat;
    }

    public String getBeliefToEat() {
        return beliefToEat;
    }

    public void setBeliefToEat(String beliefToEat) {
        this.beliefToEat = beliefToEat;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodLink() {
        return foodLink;
    }

    public void setFoodLink(String foodLink) {
        this.foodLink = foodLink;
    }

    public String getTakeOutFood() {
        return takeOutFood;
    }

    public void setTakeOutFood(String takeOutFood) {
        this.takeOutFood = takeOutFood;
    }

    public Long getOnePeopleChoose() {
        return onePeopleChoose;
    }

    public void setOnePeopleChoose(Long onePeopleChoose) {
        this.onePeopleChoose = onePeopleChoose;
    }

    public Long getMorePeopleChoose() {
        return morePeopleChoose;
    }

    public void setMorePeopleChoose(Long morePeopleChoose) {
        this.morePeopleChoose = morePeopleChoose;
    }

    public Long getSpringPeopleChoose() {
        return springPeopleChoose;
    }

    public void setSpringPeopleChoose(Long springPeopleChoose) {
        this.springPeopleChoose = springPeopleChoose;
    }

    public Long getSummerPeopleChoose() {
        return summerPeopleChoose;
    }

    public void setSummerPeopleChoose(Long summerPeopleChoose) {
        this.summerPeopleChoose = summerPeopleChoose;
    }

    public Long getAutumnPeopleChoose() {
        return autumnPeopleChoose;
    }

    public void setAutumnPeopleChoose(Long autumnPeopleChoose) {
        this.autumnPeopleChoose = autumnPeopleChoose;
    }

    public Long getWinterPeopleChoose() {
        return winterPeopleChoose;
    }

    public void setWinterPeopleChoose(Long winterPeopleChoose) {
        this.winterPeopleChoose = winterPeopleChoose;
    }

    public Long getNorthPeopleChoose() {
        return northPeopleChoose;
    }

    public void setNorthPeopleChoose(Long northPeopleChoose) {
        this.northPeopleChoose = northPeopleChoose;
    }

    public Long getSouthPeopleChoose() {
        return southPeopleChoose;
    }

    public void setSouthPeopleChoose(Long southPeopleChoose) {
        this.southPeopleChoose = southPeopleChoose;
    }

    public Long getMorningPeopleChoose() {
        return morningPeopleChoose;
    }

    public void setMorningPeopleChoose(Long morningPeopleChoose) {
        this.morningPeopleChoose = morningPeopleChoose;
    }

    public Long getNoonPeopleChoose() {
        return noonPeopleChoose;
    }

    public void setNoonPeopleChoose(Long noonPeopleChoose) {
        this.noonPeopleChoose = noonPeopleChoose;
    }

    public Long getDinnerPeopleChoose() {
        return dinnerPeopleChoose;
    }

    public void setDinnerPeopleChoose(Long dinnerPeopleChoose) {
        this.dinnerPeopleChoose = dinnerPeopleChoose;
    }
}