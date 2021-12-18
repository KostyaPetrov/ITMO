package com.company;
public class Hemul extends Mumitrolls implements Actionality, State_hemul{
    public Hemul(String s){
        super(s);
    }

    @Override
    public void Look(Action n){
        for(int i=0; i<2; i++) {
            System.out.printf("%s %s \n",toString(), n);
        }
    }
    public void Came(Action t){
        System.out.printf("%s %s\n",toString(), t);
    }

    public void Light_pull(Action n, Branch t){
        System.out.printf("%s %s %s\n",toString(), n,t);
    }

    public void Idea(State n){
        System.out.printf("%s %s\n",toString(), n);
    }

    public void Collect(Action n, Pile_brushwood t){
        System.out.printf("%s %s %s \n", toString(),n,t);
    }

    public void Go(Action n, Woodshed t, Matches m){
        System.out.printf("%s %s в %s за %s\n",toString(), n, t, m);
    }

    @Override
    public void Take(Action n, Matches t) {
        System.out.printf("%s %s %s \n", toString(), n, t);
    }

    @Override
    public void Funny_pleased(State n, State t){
        System.out.printf("%s и %s %s ", n, t, toString());
    }

    public void Sit(Action n, Fire t){
        System.out.printf("%s к %s\n", n, t);
    }

    public void Dry(Action n, Dress t){
        System.out.printf("%s %s %s\n",toString(), n, t);
    }

    public void Drag(Action n, Tail t, Fire f){
        System.out.printf("%s %s %s %s\n", toString(), n, f, t);
    }

    public void Love(Action n, State t, Fried_fish f){
        System.out.printf("%s %s %s %s", t, toString(), n, f);
    }

    @Override
    public void Pleased(State n){
        System.out.printf("%s %s ", n, toString());
    }
    @Override
    public void Appear(Action n, MumiFamily_Frands m){
        System.out.printf("%s %s\n",n, m);
    }
}
