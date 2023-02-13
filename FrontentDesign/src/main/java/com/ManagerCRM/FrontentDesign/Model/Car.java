package com.ManagerCRM.FrontentDesign.Model;

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
    private String carBrand;
    private String carModel;

    private String carNumber;
    private String bodyType;

    private double carryingCapacity;

    private String carStatus = "Free";

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
                '}';
    }
}
