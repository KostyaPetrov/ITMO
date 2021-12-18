package com.company;

public class Fetus extends Mumidolin implements Fetus_event{

    public Fetus(String s){
        super(s);
    }

    public void Wrinkle_drop(Event wrinkl, Event fall, Land land){
        System.out.printf("%s %s и %s на  %s\n",toString(), wrinkl, fall, land);
    }



}
