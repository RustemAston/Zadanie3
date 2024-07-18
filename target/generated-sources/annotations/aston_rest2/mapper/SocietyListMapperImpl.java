package aston_rest2.mapper;

import aston_rest2.dto.SocietyDTO;
import aston_rest2.model.Society;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-17T14:47:37+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class SocietyListMapperImpl implements SocietyListMapper {

    @Override
    public List<SocietyDTO> listSocietyDTO(List<Society> listSociety) {
        if ( listSociety == null ) {
            return null;
        }

        List<SocietyDTO> list = new ArrayList<SocietyDTO>( listSociety.size() );
        for ( Society society : listSociety ) {
            list.add( societyToSocietyDTO( society ) );
        }

        return list;
    }

    @Override
    public List<Society> listSociety(List<SocietyDTO> listSocietyDTO) {
        if ( listSocietyDTO == null ) {
            return null;
        }

        List<Society> list = new ArrayList<Society>( listSocietyDTO.size() );
        for ( SocietyDTO societyDTO : listSocietyDTO ) {
            list.add( societyDTOToSociety( societyDTO ) );
        }

        return list;
    }

    protected SocietyDTO societyToSocietyDTO(Society society) {
        if ( society == null ) {
            return null;
        }

        int id = 0;
        String heading = null;

        id = society.getId();
        heading = society.getHeading();

        SocietyDTO societyDTO = new SocietyDTO( id, heading );

        return societyDTO;
    }

    protected Society societyDTOToSociety(SocietyDTO societyDTO) {
        if ( societyDTO == null ) {
            return null;
        }

        Society society = new Society();

        society.setId( societyDTO.id() );
        society.setHeading( societyDTO.heading() );

        return society;
    }
}
