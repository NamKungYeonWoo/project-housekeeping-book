package com.example.common.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
@Controller
public class LoginController {
    @RequestMapping("loginForm")
    String getPagePath() {
        return "loginForm";
    }
}