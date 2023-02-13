package com.ManagerCRM.FrontentDesign.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;


public class Driver {


    private int driverId;

    private String surname;

    private String name;

    private String phoneNumber;

    private Date employmetDate;

    private Car carId;
    public Driver() {
    }

    public Driver(String surname, String name, String phoneNumber, Date employmetDate) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.employmetDate = employmetDate;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getEmploymetDate() {
        return employmetDate;
    }

    public Car getCarId() {
        return carId;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmploymetDate(Date employmetDate) {
        this.employmetDate = employmetDate;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", employmetDate=" + employmetDate +
                ", carId=" + carId +
                '}';
    }
}
