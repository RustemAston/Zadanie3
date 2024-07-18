package aston_rest2.mapper;

import aston_rest2.dto.SocietyDTO;
import aston_rest2.model.Society;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SocietyListMapper {
    List<SocietyDTO> listSocietyDTO(List<Society> listSociety);

    List<Society> listSociety(List<SocietyDTO> listSocietyDTO);
}
