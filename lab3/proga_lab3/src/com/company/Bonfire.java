package com.company;

public class Bonfire extends Mumidolin implements Burn{
    public Bonfire(String s){
        super(s);
    }

    @Override
    public void Blaze(Event n, Garden_path t){
        System.out.printf("На %s %s %s \n",t,n, toString());
    }


}
