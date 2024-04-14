package uz.pdp.person;


import lombok.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Person {
    private String fullName;
    private String age;


    private String personAddressCity;
    private String personAddressApartment;



    private String personPassportSerial;
    private String personPassporNumber;
}
