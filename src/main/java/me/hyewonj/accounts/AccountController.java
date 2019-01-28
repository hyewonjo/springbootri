package me.hyewonj.accounts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyewonjo
 */
@RestController
public class AccountController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

}
