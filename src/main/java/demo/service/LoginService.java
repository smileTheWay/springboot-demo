package demo.service;

import demo.dto.CommonResp;
import demo.dto.LoginResp;
import demo.dto.Users;

/**
 * description:LoginService
 * author:zwj
 */
public interface LoginService {
    LoginResp login(Users users);
}
