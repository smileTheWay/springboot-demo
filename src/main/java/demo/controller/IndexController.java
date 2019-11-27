package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description:IndexController
 * author:zwj
 */
@Controller
@RequestMapping(value = "demo")
public class IndexController {

    @RequestMapping(value = "/index")
    public String init(){
        System.out.println("demo init ");
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(){
        System.out.println("register init ");
        return "register";
    }
}
