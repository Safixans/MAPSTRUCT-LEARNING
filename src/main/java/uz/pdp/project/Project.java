package uz.pdp.project;

import lombok.*;
import uz.pdp.projectColumn.ProjectColumn;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Project {
    private String id;
    private String name;
    private Path documentPath;
    private LocalDateTime createdAt;
    private List<ProjectColumn> projectColumns;
}
