package com.marvin.marvinzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.DateFormat;
import java.util.Date;

/**
 * @ClassName HelloController
 * @Description
 * @Author Administrator
 * @Date 2021/10/12
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        //视图重定向hello.jsp
        return "hello";

    }
}
