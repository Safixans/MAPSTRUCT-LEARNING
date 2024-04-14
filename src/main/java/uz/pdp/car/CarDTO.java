package uz.pdp.car;


import lombok.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class CarDTO {
    private String carName;
    private double carPrice;
}
