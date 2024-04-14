package uz.pdp.projectColumn;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class ProjectColumn {
    private String id;
    private String name;
    private Integer order;
    private LocalDateTime createdAt;
}
