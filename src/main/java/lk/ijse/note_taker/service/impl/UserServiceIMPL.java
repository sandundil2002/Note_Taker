package lk.ijse.note_taker.service.impl;

import lk.ijse.note_taker.dao.UserDAO;
import lk.ijse.note_taker.dto.UserDTO;
import lk.ijse.note_taker.entity.UserEntity;
import lk.ijse.note_taker.service.UserService;
import lk.ijse.note_taker.util.AppUtil;
import lk.ijse.note_taker.util.MappingUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {

    @Autowired
    private final UserDAO userDAO;

    @Autowired
    private final MappingUtil mappingUtil;

    @Override
    public String saveUser(UserDTO userDTO) {
        userDTO.setUserId(AppUtil.generateUserID());
        userDAO.save(mappingUtil.userConvertToEntity(userDTO));
        return "User saved successfully";
    }

    @Override
    public boolean updateUser(String  id, UserDTO userDTO) {
        Optional<UserEntity> tmpUser = userDAO.findById(id);
        if (!tmpUser.isPresent()){
            return false;
        } else {
            tmpUser.get().setFirstName(userDTO.getFirstName());
            tmpUser.get().setLastName(userDTO.getLastName());
            tmpUser.get().setEmail(userDTO.getEmail());
            tmpUser.get().setPassword(userDTO.getPassword());
            tmpUser.get().setProfilePic(userDTO.getProfilePic());
            userDAO.save(tmpUser.get());
            return true;
        }
    }

    @Override
    public boolean deleteUser(String id) {
        if (userDAO.existsById(id)) {
            userDAO.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public UserDTO getUserById(String id) {
        System.out.println(userDAO.getUserEntityByUserId(id).toString());
        return mappingUtil.userConvertToDTO(userDAO.getUserEntityByUserId(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> users = userDAO.findAll();
        System.out.println(users);
        return mappingUtil.userConvertToDTOList(users);
    }

}
