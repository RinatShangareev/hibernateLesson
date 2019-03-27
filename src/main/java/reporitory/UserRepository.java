package reporitory;

import entity.User;

import java.util.List;

public interface UserRepository {

    User getById(Long id);

    List<User> getAll();

    boolean add(User entity);
    boolean update(User entity);
    boolean delete(User entity);
}
