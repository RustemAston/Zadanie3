package aston_rest2.mapper;

import aston_rest2.dto.SocietyDTO;
import aston_rest2.model.Society;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocietyMapper {
    SocietyDTO societyDTO(Society society);

    Society society(SocietyDTO societyDTO);
}
