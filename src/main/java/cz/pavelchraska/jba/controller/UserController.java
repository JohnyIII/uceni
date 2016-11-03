package cz.pavelchraska.jba.controller;

import cz.pavelchraska.jba.entity.User;
import cz.pavelchraska.jba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public User construct() {
        return new User();
    }

    @RequestMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";

    }

    @RequestMapping("/users/{id}")
    public String detail(Model model, @PathVariable int id) {
        model.addAttribute("user", userService.findOneWithBlogs(id));
        return "user-detail";
    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String showRegister() {

        return "user-register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(@ModelAttribute("user") User user) {
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.toString());
        System.out.println(user.getId());
        userService.save(user);
        return "user-register";
    }

}
