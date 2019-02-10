package com.what.eat.domain.dto;

/**
 * @Author dubaolong
 * @Date 2019/2/3 10:55 AM
 * @PackageName com.what.eat.domain.dto
 */
public class EatWhatDto {

    // 人数
    private Integer peopleNum;

    //关系
    private String relation;

    //忌口 牛羊肉、猪肉
    private String diet;

    // 信仰食物
    private String beliefFood;

    //场景
    private String scenes;


    public String getBeliefFood() {
        return beliefFood;
    }

    public void setBeliefFood(String beliefFood) {
        this.beliefFood = beliefFood;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getScenes() {
        return scenes;
    }

    public void setScenes(String scenes) {
        this.scenes = scenes;
    }
}
