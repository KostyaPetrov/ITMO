package com.company;

public class Rain extends Mumidolin implements Rain_Actionality{
    public Rain(String s){
        super(s);
    }
    public void Stoped(Action stop){
        System.out.printf("%s %s\n", toString(), stop);
    }
}
