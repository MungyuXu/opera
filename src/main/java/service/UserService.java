package service;

import pojo.User;

import java.util.List;


public interface UserService {

    boolean findUserByUsernameAndPwd(User user);

    void addUser(User user);

    boolean findByUsername(User user);

    void deleteUser(User user);
    boolean updateUser(User user);
    List<User> findAllUser();
}
