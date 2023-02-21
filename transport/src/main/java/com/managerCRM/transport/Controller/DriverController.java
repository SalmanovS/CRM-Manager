package com.managerCRM.transport.Controller;

import com.managerCRM.transport.Model.Driver;
import com.managerCRM.transport.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class DriverController {

    @Autowired
   private DriverService driverService;

    @GetMapping("/drivers/all")
    public List<Driver> allDrivers(){
        return driverService.allDrivers();

    }

    @GetMapping("/drivers/{id}")
    public Driver getByDriver(@PathVariable int id){
        return driverService.getByDriver(id);
    }
}
