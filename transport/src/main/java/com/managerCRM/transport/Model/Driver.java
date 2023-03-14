package com.managerCRM.transport.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "drivers")
public class Driver {
    @Id
    @Column(name = "driver_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    @Column(name = "driver_surname")
    private String surname;
    @Column(name = "driver_name")
    private String name;
    @Column(name = "driver_phone_number")
    private String phoneNumber;
    @Column(name = "driver_employment_date")
    private LocalDate employmetDate;
    @Column(name = "driving_category")
    private String drivingCategory;
    @Column(name = "driver_status")
    private String driverStatus;
    @OneToOne(mappedBy = "driver")
    @JsonIgnore
    private Car car;
    public Driver() {
    }

    public Driver(String surname, String name, String phoneNumber, LocalDate employmetDate, String drivingCategory, String driverStatus) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.employmetDate = employmetDate;
        this.drivingCategory= drivingCategory;
        this.driverStatus = driverStatus;
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

    public LocalDate getEmploymetDate() {
        return employmetDate;
    }

    public String getDrivingCategory(){return  drivingCategory;}
    public String getDriverStatus(){return driverStatus;}

    public Car getCar() {
        return car;
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

    public void setEmploymetDate(LocalDate employmetDate) {
        this.employmetDate = employmetDate;
    }
    public void setDrivingCategory(String drivingCategory){this.drivingCategory=drivingCategory;}

    public void setDriverStatus (String driverStatus){this.driverStatus = driverStatus;}

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", employmetDate=" + employmetDate +
                ", drivingCategory='" + drivingCategory + '\'' +
                ", driverStatus='" + driverStatus + '\'' +
                '}';
    }
}
