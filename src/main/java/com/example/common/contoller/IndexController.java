package com.example.common.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-21
 */

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping
    String getPagePath() {
        return "index";
    }
}
