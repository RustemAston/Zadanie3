package aston_rest2.service;

import aston_rest2.dto.UserDTO;
import aston_rest2.exception.UserNotFoundException;
import aston_rest2.mapper.UserListMapperImpl;
import aston_rest2.mapper.UserMapperImpl;
import aston_rest2.model.User;
import aston_rest2.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<UserDTO> getAllUsers() {
        return new UserListMapperImpl().listUserDTO(userDAO.getAllUsers());
    }

    public UserDTO getOneUser(int id) {
        Optional<User> possibleUser = userDAO.getOneUser(id);
        if (!possibleUser.isPresent())
            throw new UserNotFoundException();

        return new UserMapperImpl().userDTO(possibleUser.get());
    }

    @Transactional
    public void saveUser(UserDTO userDTO) {
        userDAO.saveUser(new UserMapperImpl().user(userDTO));
    }

    @Transactional
    public void updateUser(int id, UserDTO userDTO) {
        Optional<User> possibleUser = userDAO.getOneUser(id);
        if (!possibleUser.isPresent())
            throw new UserNotFoundException();

        userDAO.updateUser(id, new UserMapperImpl().user(userDTO));
    }

    @Transactional(readOnly = false)
    public void deleteUser(int id) {
        Optional<User> possibleUser = userDAO.getOneUser(id);
        if (!possibleUser.isPresent())
            throw new UserNotFoundException();

        userDAO.deleteUser(id);
    }
}
