package com.ManagerCRM.FrontentDesign.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String home(){
        return "home/homepage";
    }
}