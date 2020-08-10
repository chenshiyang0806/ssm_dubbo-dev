package com.stone.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stone.api.UserService;
import com.stone.pojo.TUser;
import com.stone.util.JacksonJsonUntil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description:
 * @author: ccssyy
 * @time: 2020/7/23 16:04
 */
@Controller
public class UserController {

    //注入api
    @Resource
    private UserService userService;

    /**
     * 根据id查询用户信息
     * @param id 用户id
     * @return 用户实体信息
     */
    @RequestMapping("/user/{id}")
    @ResponseBody
    public String findUserById(@PathVariable Integer id) throws JsonProcessingException {
        TUser user = userService.findUserById(id);
        String json = JacksonJsonUntil.objToJson(user);
        return json;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("name") String name, @RequestParam("pwd") String pwd) throws JsonProcessingException {
        System.out.println("接收参数----"+name + pwd);
        TUser user = new TUser();
        user.setName( name );
        user.setPwd( pwd );
        String json = JacksonJsonUntil.objToJson(user);
        return json;
    }

}
