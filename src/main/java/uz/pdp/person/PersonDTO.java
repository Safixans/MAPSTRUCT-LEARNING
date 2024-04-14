package uz.pdp.person;


import lombok.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class PersonDTO {
    private String name;
    private Integer age;

}
