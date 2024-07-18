package aston_rest2.mapper;

import aston_rest2.dto.UserDTO;
import aston_rest2.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-17T14:47:38+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userDTO(User user) {
        if ( user == null ) {
            return null;
        }

        String nickname = null;
        int age = 0;

        nickname = user.getNickname();
        age = user.getAge();

        UserDTO userDTO = new UserDTO( nickname, age );

        return userDTO;
    }

    @Override
    public User user(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setNickname( userDTO.nickname() );
        user.setAge( userDTO.age() );

        return user;
    }
}
