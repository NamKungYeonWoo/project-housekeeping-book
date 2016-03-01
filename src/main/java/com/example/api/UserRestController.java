package com.example.api;

import com.example.user.dto.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-24
 */
@RestController
@RequestMapping(name = "user")
public class UserRestController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    List<User> getUserList()
    {
        return userService.findAll();
    }
}
