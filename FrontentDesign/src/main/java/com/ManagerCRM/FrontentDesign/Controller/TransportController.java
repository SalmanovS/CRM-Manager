package com.ManagerCRM.FrontentDesign.Controller;

import com.ManagerCRM.FrontentDesign.Model.Car;
import org.springframework.http.client.reactive.ClientHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

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

    @GetMapping("edit/{id}")
    public String showCar(@PathVariable int id, Model model){
        Car car = WebClient.create().get().uri("http://localhost:8081/api/cars/{id}", id)
                .retrieve()
                .bodyToMono(Car.class)
                .block();
        model.addAttribute("editCar",car);
        return "transports/editTransport";

    }

    @PutMapping("updateCar/{id}")
    public String editCar(@PathVariable int id, @ModelAttribute Car updateCar){
        Car car = WebClient.create().get().uri("http://localhost:8081/api/cars/{id}", id)
                .retrieve().bodyToMono(Car.class).block();
        car.setCarBrand(updateCar.getCarBrand());
        car.setCarModel(updateCar.getCarModel());
        car.setCarNumber(updateCar.getCarNumber());
        car.setBodyType(updateCar.getBodyType());
        car.setCarryingCapacity(updateCar.getCarryingCapacity());
        car.setCarStatus(updateCar.getCarStatus());
        WebClient.create().put().uri("http://localhost:8081/api/cars/").body(Mono.just(car), Car.class)
                .retrieve()
                .bodyToMono(Void.class).block();
        return "redirect:/transport/";
    }


    @PostMapping("create")
    public String createCar(@ModelAttribute Car car){
        WebClient.create().post().uri("http://localhost:8081/api/cars/")
                .body(Mono.just(car), Car.class)
                .retrieve()
                .bodyToMono(Void.class)
                .block();
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
