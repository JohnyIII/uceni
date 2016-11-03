package cz.pavelchraska.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pajut on 30.10.2016.
 */
@Controller
public class indexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
