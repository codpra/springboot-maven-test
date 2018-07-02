package springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.entity.User;

import java.util.Calendar;

/**
 * @author LiuDecai
 * @date 2018/07/02.
 */
@RestController
public class HelloController {

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("刘德财");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1993, Calendar.OCTOBER, 1);
        user.setBirthday(calendar.getTime());
        return user;
    }

    @GetMapping
    public String hello() {
        return "Hello Maven.";
    }

}
