package demo.service.impl;

import demo.dto.CommonResp;
import demo.dto.LoginResp;
import demo.dto.Users;
import demo.repository.UsersRepository;
import demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * description:LoginServiceImpl
 * author:zwj
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UsersRepository userRepository;

    @Override
    public LoginResp login(Users users) {
        Users user1 = userRepository.findByUsername(users.getUsername());
        LoginResp resp = new LoginResp();
        CommonResp commonResp = new CommonResp();
        if (user1 != null) {
            commonResp.setCode(0);
            commonResp.setMessage("login");
            resp.setUsers(user1);
        }else{
            commonResp.setCode(-1);
            commonResp.setMessage("user not exist");
        }
        resp.setCommonResp(commonResp);
        return resp;
    }
}
