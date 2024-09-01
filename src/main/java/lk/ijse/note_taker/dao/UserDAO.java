package lk.ijse.note_taker.dao;

import lk.ijse.note_taker.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, String> {}
