package com.what.eat.domain.dto;

/**
 * @Author dubaolong
 * @Date 2019/2/5 3:27 PM
 * @PackageName com.what.eat.domain.dto
 */
public class EatWhatModifyDto {

    // TODO: 2019/2/3 食物名称
    private String foodName;

    // TODO: 2019/2/3 食物类型 主食/配菜/零食
    private String foodType;

    // TODO: 2019/2/3 食物最适合吃的人数
    private Integer foodNum;

    // TODO: 2019/2/3 食物最适合吃的人群 -- 情侣、家人、朋友
    private String crowd;

    // TODO: 2019/2/3 食物最适合吃的季节 春天、夏天、秋天、冬天
    private String season;

    // TODO: 2019/2/3 食物最适合南北哪方人吃 南方人、北方人
    private String placeToEat;

    // TODO: 2019/2/3 食物最适合吃的时间 早饭、中饭、晚饭
    private String timeToEat;

    // TODO: 2019/2/3 食物的信仰禁忌  普通/回族/猪肉/牛羊肉
    private String beliefToEat;

    // TODO: 2019/2/3 是否能做下午茶
    private String afterTea;

    // TODO: 2019/2/3 口味 油腻、辛辣、清淡
    private String taste;

    // TODO: 2019/2/3 食物的成本
    private String foodPrice;

    // TODO: 2019/2/3 食物常规做法的链接
    private String foodLink;

    // TODO: 2019/2/3 是否适合点外卖
    private String takeOutFood;


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

    public String getAfterTea() {
        return afterTea;
    }

    public void setAfterTea(String afterTea) {
        this.afterTea = afterTea;
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
}
