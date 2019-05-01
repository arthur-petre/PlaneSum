package com.example.totalavion;

import android.widget.TextView;

public class Time {

    private int myHours;
    private int myMinutes;

    public void normaliser() {
        this.myHours += (this.myMinutes / 60);
        this.myMinutes = (this.myMinutes % 60);
    }

    public Time(int h, int m) {
        this.myMinutes = m;
        this.myHours = h;
    }

    public void setmyHours(int h) {
        this.myHours = h;
    }

    public void setmyMinutes(int m) {
        this.myMinutes = m;
    }

    public void addmyHours(int h) {
        this.myHours += h;
    }

    public void addmyMinutes(int m) {
        this.myMinutes += m;
    }

    public int getmyHours() {
        return this.myHours;
    }

    public int getmyMinutes() {
        return this.myMinutes;
    }

}
