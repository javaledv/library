package ml.ledv.library.db.common.service;

import ml.ledv.library.db.common.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(String login);

    void deleteUser(UserEntity user);

    Optional<UserEntity> getUserById(String id);

    void updateUser(UserEntity user);

    List<UserEntity> getAll();
}
