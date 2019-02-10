package com.what.eat.domain.dto;

/**
 * @Author dubaolong
 * @Date 2019/2/5 3:43 PM
 * @PackageName com.what.eat.domain.dto
 */
public class SaveChangeDto {

    // TODO: 2019/2/5 人数为一的时候食物选择的次数
    private int onePeopleChoose;

    // TODO: 2019/2/5 人数为多人的时候食物选择的次数
    private int morePeopleChoose;

    // TODO: 2019/2/5 春天时选择的次数
    private int springPeopleChoose;

    // TODO: 2019/2/5 夏天时选择的次数
    private int summerPeopleChoose;

    // TODO: 2019/2/5 秋天时选择的次数
    private int autumnPeopleChoose;

    // TODO: 2019/2/5 冬天时选择的次数
    private int winterPeopleChoose;

    // TODO: 2019/2/5 北方人选择的次数
    private int northPeopleChoose;

    // TODO: 2019/2/5 南方人选择的次数
    private int southPeopleChoose;


    public int getOnePeopleChoose() {
        return onePeopleChoose;
    }

    public void setOnePeopleChoose(int onePeopleChoose) {
        this.onePeopleChoose = onePeopleChoose;
    }

    public int getMorePeopleChoose() {
        return morePeopleChoose;
    }

    public void setMorePeopleChoose(int morePeopleChoose) {
        this.morePeopleChoose = morePeopleChoose;
    }

    public int getSpringPeopleChoose() {
        return springPeopleChoose;
    }

    public void setSpringPeopleChoose(int springPeopleChoose) {
        this.springPeopleChoose = springPeopleChoose;
    }

    public int getSummerPeopleChoose() {
        return summerPeopleChoose;
    }

    public void setSummerPeopleChoose(int summerPeopleChoose) {
        this.summerPeopleChoose = summerPeopleChoose;
    }

    public int getAutumnPeopleChoose() {
        return autumnPeopleChoose;
    }

    public void setAutumnPeopleChoose(int autumnPeopleChoose) {
        this.autumnPeopleChoose = autumnPeopleChoose;
    }

    public int getWinterPeopleChoose() {
        return winterPeopleChoose;
    }

    public void setWinterPeopleChoose(int winterPeopleChoose) {
        this.winterPeopleChoose = winterPeopleChoose;
    }

    public int getNorthPeopleChoose() {
        return northPeopleChoose;
    }

    public void setNorthPeopleChoose(int northPeopleChoose) {
        this.northPeopleChoose = northPeopleChoose;
    }

    public int getSouthPeopleChoose() {
        return southPeopleChoose;
    }

    public void setSouthPeopleChoose(int southPeopleChoose) {
        this.southPeopleChoose = southPeopleChoose;
    }
}
