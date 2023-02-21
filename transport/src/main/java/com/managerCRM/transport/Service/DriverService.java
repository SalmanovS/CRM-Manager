package com.managerCRM.transport.Service;

import com.managerCRM.transport.Model.Driver;

import java.util.List;

public interface DriverService {

    public List<Driver> allDrivers();

    public Driver getByDriver(int id);
}
