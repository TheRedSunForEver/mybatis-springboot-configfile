package org.x.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.x.dao.UserMapper;
import org.x.domain.User;

@RestController
public class DemoController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public Object test() {
        User user = userMapper.findUserById(10);
        return user;
    }
}
