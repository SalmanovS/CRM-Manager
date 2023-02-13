package com.managerCRM.transport.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

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
    private Date employmetDate;
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
                '}';
    }
}
