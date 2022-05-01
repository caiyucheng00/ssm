package com.cyc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-30 10:49
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    private String index(){
        return "index";
    }
}
