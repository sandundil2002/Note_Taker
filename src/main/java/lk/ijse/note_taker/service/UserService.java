package lk.ijse.note_taker.service;

import lk.ijse.note_taker.customObj.UserResponse;
import lk.ijse.note_taker.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    String saveUser(UserDTO userDTO);
    void updateUser(String id, UserDTO userDTO);
    void deleteUser(String id);
    UserResponse getUserById(String id);
    List<UserDTO> getAllUsers();
}
