package ar.edu.iua.portal.hotel.service;

import ar.edu.iua.portal.hotel.entity.User;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserService {

    boolean createOrUpdateAndValidate(User user, BindingResult bindingResult);

    void createOrUpdate(User user);

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAllUsers();

    void deleteUser(Long id);

    boolean updatePassword(String username, String newPassword, String oldPassword);
}
