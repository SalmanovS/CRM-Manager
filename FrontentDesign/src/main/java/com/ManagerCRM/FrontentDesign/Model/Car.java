package com.ManagerCRM.FrontentDesign.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Car {
    public Car() {
    }

    public Car(String carBrand, String carModel, String carNumber, String bodyType, double carryingCapacity, String carStatus) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.bodyType = bodyType;
        this.carryingCapacity = carryingCapacity;
        this.carStatus = carStatus;
    }

    private int id;
    @NotBlank(message = "Please enter Brand")
    private String carBrand;
    private String carModel;
    @Pattern(regexp ="^\\d\\d-[A-Z][A-Z]-\\d\\d\\d$", message = "Please enter the number according to the template: 10-MN-829")
    private String carNumber;
    private String bodyType;

    private double carryingCapacity;

    private String carStatus = "Free";
    private Driver driver;

    public int getId() {
        return id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                ", carStatus='" + carStatus + '\'' +
                ", driver=" + driver +
                '}';
    }
}
