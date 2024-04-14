package uz.pdp.car;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper
public interface CarMapper {
     CarMapper CAR_MAPPER= Mappers.getMapper(CarMapper.class);
    @Mapping(target = "carName",source = "name")
    @Mapping(target = "carPrice",source = "price")
    CarDTO carDto(Car car);

/*
    @Mapping(source = "carName",target = "name")
    @Mapping(source = "carPrice",target = "price")*/
    @InheritInverseConfiguration
    @Mapping(target = "id",expression = "java(generateID())")
    Car toEntity(CarDTO carDTO);

    default String generateID(){
        return UUID.randomUUID().toString();
    }

    // Custom method for converting DTO to entity
    /*default Car toEntityWithCustomMethod(CarDTO carDTO){
        return new Car(null,carDTO.getCarName(),null, carDTO.getCarPrice());
    }*/

}
