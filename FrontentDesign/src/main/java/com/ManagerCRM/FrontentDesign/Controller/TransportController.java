package com.ManagerCRM.FrontentDesign.Controller;

import com.ManagerCRM.FrontentDesign.Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/transport")
public class TransportController {
    @RequestMapping("/")
    public String transportIndexPage(Model model){
        RestTemplate restTemplate = new RestTemplate();
        Car[] allCarWork = restTemplate.getForObject("http://localhost:8081/api/cars/allInWorkCars", Car[].class);
        Car[] allFreeCars = restTemplate.getForObject("http://localhost:8081/api/cars/allFreeCars", Car[].class);
        Car[] allRepairCars = restTemplate.getForObject("http://localhost:8081/api/cars/allRepairCar", Car[].class);
        Car[] allCars = restTemplate.getForObject("http://localhost:8081/api/cars/all", Car[].class);
        model.addAttribute("allFreeCars",allFreeCars);
        model.addAttribute("allInWorkCars", allCarWork);
        model.addAttribute("allRepairCars", allRepairCars);
        model.addAttribute("allCars", allCars);
        return "transports/transportIndex";
    }

    @RequestMapping("edit/{id}")
    public String editTransport(@PathVariable int id, Model model){
        RestTemplate restTemplate = new RestTemplate();
        Car editCar = restTemplate.getForObject("http://localhost:8081/api/cars/{id}",Car.class, id);
        model.addAttribute("editCar",editCar);
        return "transports/editTransport";

    }

    @PutMapping("editCar")
    public String editCar(){

        return "redirect:/transport/";
    }


    @PostMapping("create")
    public String createCar(@ModelAttribute Car car){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject("http://localhost:8081/api/cars/", car, Car.class);
        return "redirect:/transport/";


    }

    @DeleteMapping("delete/{id}")
    public String deleteCar(@PathVariable int id){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("http://localhost:8081/api/cars/{id}",id, Car.class);
        return "redirect:/transport/";
    }

    @PutMapping("changeStatusRepair/{id}")
    public String changeCarStatusRepair(@PathVariable int id){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put("http://localhost:8081/api/cars/changeStatusRepair/{id}", Car.class, id);
        return "redirect:/transport/";
    }
    @PutMapping("changeStatusFree/{id}")
    public String changeCarStatusFree(@PathVariable int id){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put("http://localhost:8081/api/cars/changeStatusFree/{id}", Car.class, id);
        return "redirect:/transport/";
    }


}
