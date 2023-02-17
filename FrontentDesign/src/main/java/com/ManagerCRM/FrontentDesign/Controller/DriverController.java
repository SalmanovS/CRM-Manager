package com.ManagerCRM.FrontentDesign.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/driver")
public class DriverController {


    @RequestMapping("/")
    public String driverIndexPage(Model model){

        return "driver/driverIndex";
    }
}
