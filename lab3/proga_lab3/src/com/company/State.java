package com.company;

public enum State {
    FUNNY("веселый"),
    IDEA("осенило"),
    DRY("сухой"),
    AS_TINDER("как трут"),
    PLEASED("довольный"),
    MORE_ANYTHING("больше всего на свете"),
    FASTER("быстро"),
    AS_GROWN("как вырос"),
    RUSTLE("шорох"),
    CRACKLE("потрескивание");

    String val;
    private State(String s){
        val=s;
    }
    public String toString(){
        return val;
    }
}
