package uz.pdp.person;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper PERSON_MAPPER= Mappers.getMapper(PersonMapper.class);
    Person toEntity(PersonDTO personDTO,AddressDTO addressDTO,PassportDTO passportDTO);


}
