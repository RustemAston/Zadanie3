package aston_rest2.mapper;

import aston_rest2.dto.UserDTO;
import aston_rest2.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserListMapper {

    List<UserDTO> listUserDTO(List<User> listUser);

    List<User> listUser(List<UserDTO> listUserDTO);

}
