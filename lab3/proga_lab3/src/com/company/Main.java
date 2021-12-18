package com.company;

public class Main {

    public static void main(String[] args) {
        Rain rain = new Rain("дождь");
        Sun sun=new Sun("солнце");
        Dust dust=new Dust("сумерки");
        rain.Stoped(Action.STOPED);
        dust.Approaching(Action.APPROACHING);
        sun.Gone(Action.GONE);
        Green_hill hill=new Green_hill("Зеленый холм");
        hill.Smth_happened(Event.SMTH_HAPPENED);
        hill.Began_fade(Event.BEGAN_FADE, State.FASTER, State.AS_GROWN);
        Fetus fetus=new Fetus("плоды");
        Land land=new Land("земля");
        fetus.Wrinkle_drop(Event.WRINKLE, Event.FALL, land);
        Flower flower=new Flower("цветы");
        flower.Droop(Event.DROOP);
        Leaves leaves=new Leaves("листья");
        leaves.Сurled_tube(Event.CURLED_TUBE);
        Home home =new Home("дом");
        home.Fill(Event.FILL,State.RUSTLE, State.CRACKLE);



        Hemul hemul=new Hemul("Хемуль");
        Branch branch=new Branch("ветка");
        hemul.Look(Action.TO_LOOK);
        hemul.Came(Action.CAME_UP);
        hemul.Light_pull(Action.LIGHT_PULL, branch);
        branch.Dry(State.DRY);
        branch.As_tinder(State.AS_TINDER);
        branch.Broke_off(Event.BROKE_OFF);
        hemul.Idea(State.IDEA);
        Pile_brushwood Pb =new Pile_brushwood("огромная куча хвороста");
        hemul.Collect(Action.COLLECT, Pb);
        Woodshed shed = new Woodshed("дровяной сарай");
        Matches match = new Matches("спички");
        hemul.Go(Action.GO, shed, match);
        hemul.Take(Action.TAKE, match);
        Garden_path road=new Garden_path("садовая дорожка");
        Bonfire bonfire = new Bonfire("костер");
        bonfire.Blaze(Event.BLAZE, road);
        Fire fire=new Fire("огонь");
        hemul.Funny_pleased(State.FUNNY, State.PLEASED);
        hemul.Sit(Action.SIT, fire);
        Dress dress=new Dress("платье");
        hemul.Dry(Action.DRY, dress);
        hemul.Idea(State.IDEA);
        Tail tail=new Tail("Хвост Панталошки");
        hemul.Drag(Action.DRAG, tail, fire);
        Fried_fish fish=new Fried_fish("жареная рыба");
        hemul.Love(Action.LOVE, State.MORE_ANYTHING, fish);
        MumiFamily_Frands family_and_frands=new MumiFamily_Frands("муми-семейство и его друзья");
        Veranda veranda=new Veranda("веранда");
        Door door=new Door("дверь");
        family_and_frands.Go_through(Action.GO_TGROUGH, Action.OPEN, veranda, door);
        hemul.Pleased(State.PLEASED);
        hemul.Appear(Action.APPEAR, family_and_frands);
    }
}
