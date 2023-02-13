package com.managerCRM.transport.Service;

import com.managerCRM.transport.Model.Car;

import java.util.List;

public interface CarService {

    public void addNewCar(Car car);

    public Car getByCarId(int id);

    public void deleteCarById(int id);

    public void updateCar(Car car);

    public List<Car> showAllCar();

    public List<Car> findByCarStatus(String status);

    Car changeCarStatusRepair(int id);
    Car changeCarStatusFree(int id);

}