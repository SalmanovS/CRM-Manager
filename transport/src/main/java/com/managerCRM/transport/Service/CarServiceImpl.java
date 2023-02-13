package com.managerCRM.transport.Service;

import com.managerCRM.transport.Model.Car;
import com.managerCRM.transport.Repository.CarRepository;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;


    public void addNewCar(Car car){
        carRepository.save(car);
    }
    public Car getByCarId(int id){
        Car car = null;
        Optional<Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            car = optionalCar.get();
        }
        return car;
    }

    public void deleteCarById(int id){
        carRepository.deleteById(id);
    }

    @Override
    public void updateCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> showAllCar() {
        List <Car> allCar = carRepository.findAll();
        return allCar;
    }

    @Override
    public List<Car> findByCarStatus(String status) {
        List<Car> freeCarList = carRepository.findByCarStatus(status);
        return freeCarList;
    }

    @Override
    public Car changeCarStatusRepair(int id) {
        Car car = null;
        Optional<Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            car = optionalCar.get();
        }
        car.setCarStatus("Under repair");
        carRepository.save(car);
        return car;
    }

    @Override
    public Car changeCarStatusFree(int id) {
        Car car = null;
        Optional<Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            car = optionalCar.get();
        }
        car.setCarStatus("Free");
        carRepository.save(car);
        return car;
    }


}
