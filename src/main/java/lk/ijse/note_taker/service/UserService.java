package lk.ijse.note_taker.service;

import lk.ijse.note_taker.dto.UserDTO;

import java.util.List;

public interface UserService {
    String saveUser(UserDTO userDTO);
    boolean updateUser(String id, UserDTO userDTO);
    boolean deleteUser(String id);
    UserDTO getUserById(String id);
    List<UserDTO> getAllUsers();
}
