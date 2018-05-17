package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    //检查用户名和密码是否正确以登录
    User findUserByUsernameAndPwd(User user);

    //注册
    void addUser(User user);

    //注册中先判断用户是否存在
    User findByUsername(User user);

    //注销用户
    void deleteUser(User user);

    //修改用户
    void updateUser(User user);

    //查询所有用户
    List<User> findAllUser();
}
