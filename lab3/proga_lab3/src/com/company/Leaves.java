package com.company;

public class Leaves extends Flower{
    public Leaves(String s){
        super(s);
    }
    @Override
    public void Сurled_tube(Event tube){
        System.out.printf("%s %s \n", toString(), tube);
    }
}
