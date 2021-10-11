package service;

import bean.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：07
 * @date ：Created in 16:58 2021/10/11
 * @Description：TODO
 * @Modified By：
 * @Version: 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserAll(){
        return userMapper.select();
    }

}
