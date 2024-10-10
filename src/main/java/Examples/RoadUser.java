package com.btcag.bootcamp.XXX;

import com.btcag.bootcamp.Coordinates;

public abstract class RoadUser {
    Coordinates c = new Coordinates();


    RoadUser(){
        this.c.x = 0;
        this.c.y = 0;
    }
    RoadUser(Coordinates c) {
        this.c = c;
    }

    public void moveForward(){
        this.c.x  += this.getSpeed();
    }

    protected abstract int getSpeed();

}
