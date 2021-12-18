package com.company;
public class Branch extends Mumidolin implements Eventable, State_branch {
    public Branch(String s){
        super(s);
    }
    public String Branch(String s){
        return toString();
    }

    public void Dry(State n){
        System.out.printf("%s %s ",toString(), n);
    }

    public void As_tinder(State n){
        System.out.printf("%s\n", n);
    }

    @Override
    public void Broke_off(Event n){
        System.out.printf("%s %s\n",toString(),n);
    }
}
