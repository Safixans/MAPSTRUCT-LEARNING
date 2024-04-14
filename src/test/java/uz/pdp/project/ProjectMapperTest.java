package uz.pdp.project;

import org.junit.jupiter.api.Test;
import uz.pdp.projectColumn.ProjectColumn;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static uz.pdp.project.ProjectMapper.PROJECT_MAPPER;

class ProjectMapperTest {

    @Test
    void toDTO() {
        Project project = new Project("1","new Java Backend ", Path.of("https://online.pdp.uz/java-backend.pdf"),null,null);
        ProjectDTO dto = PROJECT_MAPPER.toDTO(project);
        System.out.println("dto = " + dto);
    }
    @Test
    void toDTOWithProjectColumn() {

        List<ProjectColumn> projectColumns = List.of(
                new ProjectColumn("1","TODO",1,LocalDateTime.now()),
                new ProjectColumn("2","Doing",2,LocalDateTime.now()),
                new ProjectColumn("3","Done",3,LocalDateTime.now()),
                new ProjectColumn("4","QA",4,LocalDateTime.now())
        );
        Project project = new Project("1","new Java Backend ", Path.of("https://online.pdp.uz/java-backend.pdf"),
                LocalDateTime.now(),
                projectColumns);
        ProjectDTO dto = PROJECT_MAPPER.toDTO(project);
        System.out.println("dto = " + dto);
    }
}