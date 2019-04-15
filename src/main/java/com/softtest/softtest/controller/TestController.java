package com.softtest.softtest.controller;

import com.softtest.softtest.entity.User;
import com.softtest.softtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String selectUserByKey(@RequestParam(name = "id", required = false) Integer id, Model model) {
        if (id == null) {
            id = 1;
        }
        User user = userService.selectByPrimaryKey(id);
        model.addAttribute("user", user);
        return "test/testuser";
    }
}