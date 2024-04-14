package uz.pdp.person;

import org.junit.jupiter.api.Test;
import org.mapstruct.Mapping;

import static org.junit.jupiter.api.Assertions.*;
import static uz.pdp.person.PersonMapper.PERSON_MAPPER;

class PersonMapperTest {

    @Test
    void toEntity() {
        PersonDTO personDTO=new PersonDTO("Safixon Abdusattorov",21);
        AddressDTO addressDTO = new AddressDTO("Tashkent","Muhbir ,47");
        PassportDTO passportDTO = new PassportDTO("AB",12345678);


        Person entity = PERSON_MAPPER.toEntity(personDTO, addressDTO, passportDTO);
        System.out.println("entity = " + entity);
    }

}

