package aston_rest2.mapper;

import aston_rest2.dto.AdvertiseDTO;
import aston_rest2.model.Advertise;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdvertiseListMapper {
    List<AdvertiseDTO> listAdvertiseDTO(List<Advertise> listAdvertise);

    List<Advertise> listAdvertise(List<AdvertiseDTO> listAdvertiseDTO);
}
