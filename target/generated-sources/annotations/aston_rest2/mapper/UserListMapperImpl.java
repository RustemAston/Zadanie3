package aston_rest2.mapper;

import aston_rest2.dto.UserDTO;
import aston_rest2.model.User;
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
public class UserListMapperImpl implements UserListMapper {

    @Override
    public List<UserDTO> listUserDTO(List<User> listUser) {
        if ( listUser == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( listUser.size() );
        for ( User user : listUser ) {
            list.add( userToUserDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> listUser(List<UserDTO> listUserDTO) {
        if ( listUserDTO == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( listUserDTO.size() );
        for ( UserDTO userDTO : listUserDTO ) {
            list.add( userDTOToUser( userDTO ) );
        }

        return list;
    }

    protected UserDTO userToUserDTO(User user) {
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

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setNickname( userDTO.nickname() );
        user.setAge( userDTO.age() );

        return user;
    }
}
