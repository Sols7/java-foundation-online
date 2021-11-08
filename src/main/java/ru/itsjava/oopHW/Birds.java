package ru.itsjava.oopHW;

public class Birds {
    private final String nameView;
    private boolean canToFly;

    public Birds(String nameView){
        this.nameView = nameView;
    }

    public Birds(String nameView, boolean canToFly){
        this.nameView = nameView;
        this.canToFly = canToFly;
    }

    public String toString(){
        return "{nameView:" + nameView + " canToFly:" + canToFly + "}";
    }

}
