package com.example.planesum;

public class Time {

    private int myHours;
    private int myMinutes;

    protected Time(int h, int m) {
        this.myMinutes = m;
        this.myHours = h;
    }

    protected void normaliser() {
        this.myHours += (this.myMinutes / 60);
        this.myMinutes = (this.myMinutes % 60);
    }

    protected void setmyHours(int h) {
        this.myHours = h;
    }

    protected void setmyMinutes(int m) {
        this.myMinutes = m;
    }

    protected void addmyHours(int h) {
        this.myHours += h;
    }

    protected void addmyMinutes(int m) {
        this.myMinutes += m;
    }

    protected int getmyHours() {
        return this.myHours;
    }

    protected int getmyMinutes() {
        return this.myMinutes;
    }

}
