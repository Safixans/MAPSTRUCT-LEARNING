package uz.pdp.projectColumn;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class ProjectColumnDTO {
    private String pc_name;
    private Integer pc_order;
    private String pc_createdAt;
}
