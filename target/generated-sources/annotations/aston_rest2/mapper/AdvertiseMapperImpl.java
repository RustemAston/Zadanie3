package aston_rest2.mapper;

import aston_rest2.dto.AdvertiseDTO;
import aston_rest2.model.Advertise;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-17T14:47:38+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class AdvertiseMapperImpl implements AdvertiseMapper {

    @Override
    public AdvertiseDTO getAdvertiseDTO(Advertise advertise) {
        if ( advertise == null ) {
            return null;
        }

        String title = null;

        title = advertise.getTitle();

        AdvertiseDTO advertiseDTO = new AdvertiseDTO( title );

        return advertiseDTO;
    }

    @Override
    public Advertise getAdvertise(AdvertiseDTO advertiseDTO) {
        if ( advertiseDTO == null ) {
            return null;
        }

        Advertise advertise = new Advertise();

        advertise.setTitle( advertiseDTO.title() );

        return advertise;
    }
}
