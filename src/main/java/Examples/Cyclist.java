package com.btcag.bootcamp.XXX;

import com.btcag.bootcamp.Coordinates;

public class Cyclist extends RoadUser{

    Cyclist(Coordinates c) {
        super(c);
    }

    @Override
    protected int getSpeed() {
        return 10;
    }
}
