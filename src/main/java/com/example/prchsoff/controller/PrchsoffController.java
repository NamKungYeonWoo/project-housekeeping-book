package com.example.prchsoff.controller;

import com.example.prchsoff.service.PrchsoffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
@Controller
@RequestMapping("prchsoff")
public class PrchsoffController {
    @Autowired
    PrchsoffService prchsoffService;

    @RequestMapping("list")
    String list() {
        return "prchsoff/list";
    }
}
