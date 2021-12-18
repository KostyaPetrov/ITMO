package com.company;

public class Green_hill extends Mumitrolls implements Hill_eventable{
    public Green_hill(String s){
        super(s);
    }
    @Override
    public void Smth_happened(Event happened){
        System.out.printf("%s c %s\n", happened, toString());
    }
    @Override
    public void Began_fade(Event fade, State fast, State grow){
        System.out.printf("%s %s также %s %s\n", toString(), fade, fast, grow);
    }
    @Override
    public void Fill(Event fill, State rustle, State crachle){
        System.out.printf("");
    }
}
