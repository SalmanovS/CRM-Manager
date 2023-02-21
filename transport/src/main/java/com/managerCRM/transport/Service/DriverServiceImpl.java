package com.managerCRM.transport.Service;

import com.managerCRM.transport.Model.Driver;
import com.managerCRM.transport.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> allDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getByDriver(int id) {
        Driver driver= null;
        Optional<Driver> optionalDriver= driverRepository.findById(id);
        if(optionalDriver.isPresent()){
            driver = optionalDriver.get();
        }
        return driver;
    }
}
