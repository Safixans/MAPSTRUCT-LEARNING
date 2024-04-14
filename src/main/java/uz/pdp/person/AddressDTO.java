package uz.pdp.person;


import lombok.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class AddressDTO {
    private String city;
    private Integer apartment;

}
