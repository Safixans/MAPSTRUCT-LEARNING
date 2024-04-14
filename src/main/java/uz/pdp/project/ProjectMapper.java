package uz.pdp.project;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import uz.pdp.projectColumn.ProjectColumnMapper;

import java.nio.file.Path;
import java.time.LocalDateTime;

@Mapper(
        uses = {ProjectColumnMapper.class}
)
public interface ProjectMapper {

    ProjectMapper PROJECT_MAPPER= Mappers.getMapper(ProjectMapper.class);

    @Mapping(target = "documentPath",source = "documentPath",qualifiedByName = "pathToString") // this is for converting PATH to string
    @Mapping(target = "createdAt",source = "createdAt",dateFormat = "dd.MM.yyyy")
    ProjectDTO toDTO(Project project);

/*
    @Named("dateToString")
    default String dateToString(LocalDateTime localDateTime){
        if (PROJECT_MAPPER == null) {
            return null;
        }
        return localDateTime.toString();
    }*/

    @Named("pathToString")
    default String pathToString(Path path){
        if (path == null) {
            return null;
        }
        return path.toString();
    }
}
