package com.managerCRM.transport.Controller;

import com.managerCRM.transport.Model.Car;
import com.managerCRM.transport.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable int id){
        Car car = carService.getByCarId(id);
     return car;
    }

    @PostMapping("/cars/")
    public void addNewCar(@RequestBody Car car){
        carService.addNewCar(car);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable int id){
        carService.deleteCarById(id);
    }

    @PutMapping("/cars/")
    public void updateCar(@RequestBody Car car){
        carService.updateCar(car);
    }

    @GetMapping("/cars/all")
    public List<Car> showAllCars(){
        List<Car> allCars = carService.showAllCar();
        return allCars;
    }

    @GetMapping("/cars/allFreeCars")
    public List<Car> findByCarStatusFree(){
        List<Car> freeCarList = carService.findByCarStatus("Free");
        return freeCarList;
    }

    @GetMapping("/cars/allInWorkCars")
    public List<Car> findByCarStatusWork(){
        List<Car> freeCarList = carService.findByCarStatus("in work");
        return freeCarList;
    }

    @GetMapping("/cars/allRepairCar")
    public List<Car> findByCarStatusRepair() {
        List<Car> freeCarList = carService.findByCarStatus("Under repair");
        return freeCarList;
    }

    @PutMapping("/cars/changeStatusRepair/{id}")
    public Car changeStatusRepair(@PathVariable int id){
        Car car = carService.changeCarStatusRepair(id);
        return car;
    }

    @PutMapping("/cars/changeStatusFree/{id}")
    public Car changeStatusFree(@PathVariable int id){
        Car car = carService.changeCarStatusFree(id);
        return car;
    }

}
