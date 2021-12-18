package com.company;

public class MumiFamily_Frands extends Mumitrolls implements Actionality_family{
    public MumiFamily_Frands(String s){
        super(s);
    }

    public void Go_through(Action n, Action open, Veranda t, Door door){
        System.out.printf("%s %s через %s и %s %s\n",toString(), n, t, open, door);
    }

}
