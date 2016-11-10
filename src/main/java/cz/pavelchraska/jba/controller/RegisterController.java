package cz.pavelchraska.jba.controller;

import cz.pavelchraska.jba.entity.User;
import cz.pavelchraska.jba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Pajut on 10.11.2016.
 */
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User constructUser() {
        return new User();
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegister() {

        return "user-register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if(result.hasErrors()){
            return "user-register";

        }
        userService.save(user);
        return "redirect:/register.html?success=true";
    }
}
