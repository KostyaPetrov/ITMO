package com.company;

public class Flower extends Mumidolin implements Flower_event{
    public Flower(String s){
        super (s);
    }
    @Override
    public void Droop(Event droop){
        System.out.printf("%s %s \n", toString(), droop);
    }
    @Override
    public void Сurled_tube(Event tube){
        System.out.printf("");
    }
}
