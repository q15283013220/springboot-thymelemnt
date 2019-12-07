package com.example.springbootthymelemnt.controller;

import com.example.springbootthymelemnt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.baidu.com");
        map.addAttribute("flag", "yes");
        map.addAttribute("list", getUserList());
        map.addAttribute("name", "neo");
        map.addAttribute("age", 30);
        map.addAttribute("flag", "yes");
        map.addAttribute("sex", "woman");
        return "hello";
    }

    @RequestMapping("index")
    public String index2() {
        return "index";
    }

    private List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user1 = new User("张三", 12, "111");
        User user2 = new User("李四", 21, "22");
        User user3 = new User("王五", 22, "33");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println(user1);
        return list;
    }
}
