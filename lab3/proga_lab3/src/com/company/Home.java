package com.company;

public class Home extends Green_hill{
    public Home(String s){
        super(s);
    }
    @Override
    public void Fill(Event fill, State rustle, State crachle){
        System.out.printf("%s %s %s и %s\n", toString(), fill, rustle, crachle);
    }
}
