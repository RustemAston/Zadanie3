package aston_rest2.mapper;

import aston_rest2.dto.AdvertiseDTO;
import aston_rest2.model.Advertise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdvertiseMapper {
    AdvertiseDTO getAdvertiseDTO(Advertise advertise);

    Advertise getAdvertise(AdvertiseDTO advertiseDTO);
}
