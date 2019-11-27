package demo.controller;


import demo.dto.CommonResp;
import demo.dto.LoginResp;
import demo.dto.Users;
import demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * description:LoginController
 * author:zwj
 */
@Controller
@RequestMapping(value = "login",method = RequestMethod.POST, produces = "application/json",consumes= {"application/json","application/x-www-form-urlencoded"})
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @PostMapping(value = "/login" )
    public LoginResp login(Users users){

        System.out.println("login init ");

        return loginService.login(users);
    }
}
