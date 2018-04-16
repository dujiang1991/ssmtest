package com.ssm.controller;

import com.ssm.pojo.TbUser;
import com.ssm.service.UserService;
import com.ssm.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String pageForword() {
        System.out.println(111);
        return "login";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String Userlist() {
        System.out.println(111);
        List<TbUser> all = userService.findAll();
        String json = JsonUtils.objectToJson(all);
        return json ;


    }
}
