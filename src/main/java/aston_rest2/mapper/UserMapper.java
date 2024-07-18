package aston_rest2.mapper;

import aston_rest2.dto.UserDTO;
import aston_rest2.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO userDTO(User user);

    User user(UserDTO userDTO);

}
