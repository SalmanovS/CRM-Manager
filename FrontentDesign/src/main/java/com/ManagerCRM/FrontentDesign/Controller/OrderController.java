package com.ManagerCRM.FrontentDesign.Controller;

import com.ManagerCRM.FrontentDesign.Model.Car;
import com.ManagerCRM.FrontentDesign.Model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/order")
public class OrderController {


    @RequestMapping("/")
    public String orderIndex(Model model){

        return "order/orderIndex";
    }

    @RequestMapping("create")
    public String createOrder(Model model){
        LocalDateTime localDateTime = LocalDateTime.now();
        String orderNumber = localDateTime.getYear() +"" + localDateTime.getMonthValue()+ ""+localDateTime.getDayOfMonth() +
                ""+ localDateTime.getHour()+""+ localDateTime.getMinute()+""+ localDateTime.getSecond();
        RestTemplate restTemplate = new RestTemplate();
        Driver[] drivers = restTemplate.getForObject("http://localhost:8081/api/drivers/all", Driver[].class);
        Car[] allCars = restTemplate.getForObject("http://localhost:8081/api/cars/all", Car[].class);
        model.addAttribute("allCars",allCars);
        model.addAttribute("orderNumber",orderNumber);
        model.addAttribute("drivers",drivers);

        return "order/createOrder";
    }

    @RequestMapping("directions")
    @ResponseBody
    public Long distance(@RequestParam("startLocation") String startLocation, @RequestParam("endLocation") String endLocation){
        RestTemplate restTemplate = new RestTemplate();
        Long distance = restTemplate.getForObject("http://localhost:8083/api/orders/directionsApi/{startLocation}-{endLocation}",Long.class,startLocation,endLocation);
        if(distance == null){
            return 0L;
        }else {
            return distance;
        }

    }

}
