package aston_rest2.mapper;

import aston_rest2.dto.SocietyDTO;
import aston_rest2.model.Society;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-17T14:47:38+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class SocietyMapperImpl implements SocietyMapper {

    @Override
    public SocietyDTO societyDTO(Society society) {
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

    @Override
    public Society society(SocietyDTO societyDTO) {
        if ( societyDTO == null ) {
            return null;
        }

        Society society = new Society();

        society.setId( societyDTO.id() );
        society.setHeading( societyDTO.heading() );

        return society;
    }
}
