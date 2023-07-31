package crud.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import crud.demo.model.User;


public interface UserService {

    // User saveUser(UserRegistrationDTO regsitrationDTO);

    List<User> findAllUsers();

    Optional<User> findByIdUser(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    Page<User> findPagiPage(int pageNo, int pageSize, String sortField, String sortDirection);

}
