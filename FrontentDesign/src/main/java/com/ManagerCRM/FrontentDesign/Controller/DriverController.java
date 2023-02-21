package com.ManagerCRM.FrontentDesign.Controller;

import com.ManagerCRM.FrontentDesign.Model.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
@RequestMapping("/driver")
public class DriverController {


    @RequestMapping("/")
    public String driverIndexPage(Model model){
        RestTemplate restTemplate = new RestTemplate();
        Driver [] allDrivers = restTemplate.getForObject("http://localhost:8081/api/drivers/all", Driver[].class);
        model.addAttribute("allDrivers",allDrivers);
        return "driver/driverIndex";
    }


    @RequestMapping("info/{id}")
    public String getDriverInfo(@PathVariable int id, Model model){
        RestTemplate restTemplate = new RestTemplate();
        Driver driverInfo = restTemplate.getForObject("http://localhost:8081/api/drivers/{id}",Driver.class, id);
        model.addAttribute("driverInfo",driverInfo );
        return "driver/driverInfo";
    }
}
