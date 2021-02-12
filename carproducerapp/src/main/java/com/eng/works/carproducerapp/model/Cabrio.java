package com.eng.works.carproducerapp.model;

import com.eng.works.carproducerapp.model.base.Car;

/**
 * Created by eyubakay at 9.02.2021 18:17
 */
public class Cabrio implements Car {
    @Override
    public String getType() {
        return "Cabrio Car has produced";
    }
}
