package uz.pdp.project;

import lombok.*;
import uz.pdp.projectColumn.ProjectColumn;
import uz.pdp.projectColumn.ProjectColumnDTO;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class ProjectDTO {
    private String id;
    private String name;
    private String documentPath;
    private List<ProjectColumnDTO> projectColumns;
    private String createdAt;
}
