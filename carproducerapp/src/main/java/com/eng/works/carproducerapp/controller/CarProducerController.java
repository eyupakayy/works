package com.eng.works.carproducerapp.controller;

import com.eng.works.carproducerapp.model.base.Car;
import com.eng.works.carproducerapp.producer.CarProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by eyubakay at 9.02.2021 18:09
 */

@RestController
@RequestMapping("/api")
public class CarProducerController {

    @Autowired
    CarProducerService carProducerService;

    @GetMapping("/produce")
//    @ResponseBody
    public String produce(@RequestParam(value = "type") String type) {

        Car car = carProducerService.produce(type);

        if(car == null){
            return "invalid type";
        }else{
            return car.getType();
        }
    }


    public void setCarProducerService(CarProducerService carProducerService) {
        this.carProducerService = carProducerService;
    }
}
