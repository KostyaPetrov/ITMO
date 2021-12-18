package com.company;

public enum Action{
    TO_LOOK("глядел"),
    CAME_UP("подошел"),
    LIGHT_PULL("легко потянул"),
    COLLECT("собрал"),
    TAKE("взял"),
    GO("сходил"),
    SIT("подсел"),
    DRY("сушить"),
    DRAG("тащить"),
    LOVE("любит"),
    GO_TGROUGH("проложили путь"),
    OPEN("распахнули"),
    APPEAR("предстал"),
    STOPED("перестал"),
    //approaching
    APPROACHING("близились"),
    GONE("зашло");


    String val;
    private Action(String s){
        val=s;
    }
    public String toString(){
        return val;
    }
}
