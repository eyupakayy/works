package com.eng.works.carproducerapp.model;

import com.eng.works.carproducerapp.model.base.Car;

/**
 * Created by eyubakay at 9.02.2021 18:17
 */
public class Hatchback implements Car {


    private String type;

    public Hatchback() {
        this.type = "Hatchback";
    }


    @Override
    public String getType() {
        return this.type;
    }
}
