package uz.pdp.person;


import lombok.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class PassportDTO {
    private String serial;
    private Integer number;

}
