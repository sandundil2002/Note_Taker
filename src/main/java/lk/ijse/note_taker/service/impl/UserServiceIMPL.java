package lk.ijse.note_taker.service.impl;

import lk.ijse.note_taker.dto.UserDTO;
import lk.ijse.note_taker.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceIMPL implements UserService {
    @Override
    public String saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public boolean updateUser(UserDTO userDTO) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    @Override
    public UserDTO getUserById(String id) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }
}
