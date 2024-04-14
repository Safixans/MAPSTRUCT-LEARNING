package uz.pdp;

import org.junit.jupiter.api.Test;
import uz.pdp.car.Car;
import uz.pdp.car.CarDTO;

import static uz.pdp.car.CarMapper.CAR_MAPPER;

class CarMapperTest {

    @Test
    void carDto() {
        Car car=new Car("1","Cobalt","GM",1200);

        CarDTO carDTO = CAR_MAPPER.carDto(car);
        System.out.println("carDTO " +carDTO);

        Car entity = CAR_MAPPER.toEntity(carDTO);
        System.out.println("entity = " + entity);


//        Car entityWithCustomMethod =  CAR_MAPPER.toEntityWithCustomMethod(carDTO);
//        System.out.println("entityWithCustomMethod = " + entityWithCustomMethod);

    }
}