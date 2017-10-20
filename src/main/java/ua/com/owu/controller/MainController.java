package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

@Controller
public class MainController {
//    @Autowired
//    private UserService userService;
    @RequestMapping("/")
//    @GetMapping
//    @PostMapping
    public String home(){
        return "index";
    }

//    @GetMapping("/userPage")
//    public String page(){
//        return "userPage";
//    }
//
//    @PostMapping("/save")
//    public String save(@RequestParam String name){
//    userService.save(new User(name));
//        return "index";
//    }

}
