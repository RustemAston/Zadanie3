package aston_rest2.mapper;

import aston_rest2.dto.AdvertiseDTO;
import aston_rest2.model.Advertise;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-17T14:47:38+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class AdvertiseListMapperImpl implements AdvertiseListMapper {

    @Override
    public List<AdvertiseDTO> listAdvertiseDTO(List<Advertise> listAdvertise) {
        if ( listAdvertise == null ) {
            return null;
        }

        List<AdvertiseDTO> list = new ArrayList<AdvertiseDTO>( listAdvertise.size() );
        for ( Advertise advertise : listAdvertise ) {
            list.add( advertiseToAdvertiseDTO( advertise ) );
        }

        return list;
    }

    @Override
    public List<Advertise> listAdvertise(List<AdvertiseDTO> listAdvertiseDTO) {
        if ( listAdvertiseDTO == null ) {
            return null;
        }

        List<Advertise> list = new ArrayList<Advertise>( listAdvertiseDTO.size() );
        for ( AdvertiseDTO advertiseDTO : listAdvertiseDTO ) {
            list.add( advertiseDTOToAdvertise( advertiseDTO ) );
        }

        return list;
    }

    protected AdvertiseDTO advertiseToAdvertiseDTO(Advertise advertise) {
        if ( advertise == null ) {
            return null;
        }

        String title = null;

        title = advertise.getTitle();

        AdvertiseDTO advertiseDTO = new AdvertiseDTO( title );

        return advertiseDTO;
    }

    protected Advertise advertiseDTOToAdvertise(AdvertiseDTO advertiseDTO) {
        if ( advertiseDTO == null ) {
            return null;
        }

        Advertise advertise = new Advertise();

        advertise.setTitle( advertiseDTO.title() );

        return advertise;
    }
}
