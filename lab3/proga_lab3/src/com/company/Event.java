package com.company;

public enum Event {
    BROKE_OFF("отломилась"),
    BLAZE("запылал"),
    SMTH_HAPPENED("что-то случилось"),
    BEGAN_FADE("стал увядать"),
    WRINKLE ("сморщились"),
    FALL("попадали"),
    DROOP("поникли"),
    CURLED_TUBE("свернулись трубочками"),
    FILL("наполнился");
    String val;
    private Event(String s){
        val=s;
    }
    public String toString(){
        return val;
    }
}
