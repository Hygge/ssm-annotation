package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

/**
 * @author ：07
 * @date ：Created in 16:49 2021/10/11
 * @Description：TODO
 * @Modified By：
 * @Version: 1.0
 */
@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return userService.getUserAll();
    }
}
