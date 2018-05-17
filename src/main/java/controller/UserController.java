package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import service.UserService;

import java.util.List;

@Controller
@RequestMapping(value = "User")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "login")
    public String login(User user) {

        boolean a = userService.findUserByUsernameAndPwd(user);
        if (a) {
            return "success";
        }
        return "false";
    }


    @RequestMapping(value = "register")
    @ResponseBody
    public String addUser(User user) {
        if (userService.findByUsername(user)) {
            return "false";
        }
        userService.addUser(user);
        return "success";
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public int deleteUser(User user) {
        userService.deleteUser(user);
        return 1;
    }

    //修改用户
    @ResponseBody
    @RequestMapping(value = "update")
    public int updateUser(User user) {
        boolean a = userService.updateUser(user);
        if (a) {
            return 1;
        } else {
            return 0;
        }
    }

    @RequestMapping(value = "findAllUser")
    @ResponseBody
    public List<User> findAllUser() {
        List<User> users = userService.findAllUser();
        return users;
    }

}
