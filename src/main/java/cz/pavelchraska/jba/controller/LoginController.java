package cz.pavelchraska.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pajut on 2.11.2016.
 */
@Controller
public class LoginController {

    @RequestMapping("/login.html")
    public String login(){
        return "login";

    }
}
