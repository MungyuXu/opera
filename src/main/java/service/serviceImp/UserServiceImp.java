package service.serviceImp;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    public boolean findUserByUsernameAndPwd(User user) {
        User user1 = userMapper.findUserByUsernameAndPwd(user);
        if (user1 == null) {
            return false;
        } else
            return true;
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public boolean findByUsername(User user) {
        User user2 = userMapper.findByUsername(user);
        if (user2 == null) {
            return false;
        } else
            return true;
    }

    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    //修改用户
    public boolean updateUser(User user) {
        User user3 = userMapper.findByUsername(user);
        if (user3 == null) {
            return false;
        } else {
            userMapper.updateUser(user);
            return true;
        }
    }

    public List<User> findAllUser(){
       return userMapper.findAllUser();
    }
}
