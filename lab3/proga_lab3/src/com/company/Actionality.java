package com.company;

public interface Actionality {
    void Look(Action n);
    void Came(Action t);
    void Light_pull(Action n, Branch t);
    void Collect(Action n, Pile_brushwood t);
    void Take(Action n, Matches t);
    void Go(Action n, Woodshed t, Matches m);
    void Sit(Action n, Fire t);
    void Dry(Action n, Dress t);
    void Drag(Action n, Tail t, Fire f);
    void Love(Action n, State t, Fried_fish f);
    void Appear(Action n, MumiFamily_Frands m);

}
