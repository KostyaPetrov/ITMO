package com.company;

public class Sun extends Mumidolin implements Sun_Actionality{
    public Sun(String s){
        super(s);
    }
    public void Gone(Action gon){
        System.out.printf("%s %s\n", toString(), gon);
    }
}
