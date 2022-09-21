package com.hwTwenty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/userLogin")
    public String display(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (password.equals("admin")) {
            String msg = "hello " + username;
            model.addAttribute("message", msg);
            return "viewpage";
        } else {
            String msg = "sorry " + username + " wrong password";
            model.addAttribute("message", msg);
            return "errorpage";
        }
    }

}
