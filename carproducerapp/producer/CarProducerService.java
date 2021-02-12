package com.eng.works.carproducerapp.producer;

import com.eng.works.carproducerapp.model.Cabrio;
import com.eng.works.carproducerapp.model.Hatchback;
import com.eng.works.carproducerapp.model.Sedan;
import com.eng.works.carproducerapp.model.base.Car;
import org.springframework.stereotype.Component;

/**
 * Created by eyubakay at 9.02.2021 18:19
 */
@Component
public class CarProducerService {

    public Car produce(String type){

        switch (type.toLowerCase()){
            case "sedan":
                return new Sedan();
            case "cabrio":
                return new Cabrio();
            case "hatchback":
                return new Hatchback();
            default: return null;
        }
    }

}
