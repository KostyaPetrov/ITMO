package com.company;

public class Dust extends Mumidolin implements Dust_Actionality{
    public Dust(String s){
        super(s);
    }
    public void Approaching(Action app){
        System.out.printf("%s %s\n", toString(), app);
    }
}
