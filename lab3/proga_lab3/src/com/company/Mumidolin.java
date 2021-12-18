package com.company;

public abstract class Mumidolin {
    String Name;
    public Mumidolin(String n){
        this.Name=n;
        System.out.printf("объект %s создан\n", toString());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == null || this.getClass()!= obj.getClass()) return false;
        Mumidolin another = (Mumidolin)obj;
        return this.toString() == another.toString();
    }
    public int hashCode() {
        return this.Name.hashCode();
    }
    public String toString(){
        return this.Name;
    }
}
