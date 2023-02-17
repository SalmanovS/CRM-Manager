package com.ManagerCRM.FrontentDesign.Model;



import java.util.Date;


public class Driver {


    private int driverId;

    private String surname;

    private String name;

    private String phoneNumber;

    private Date employmetDate;

    private String drivingCategory;

    private String driverStatus = "Free";
    public Driver() {
    }

    public Driver(String surname, String name, String phoneNumber, Date employmetDate, String drivingCategory, String driverStatus) {
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

    public Date getEmploymetDate() {
        return employmetDate;
    }

    public String getDrivingCategory(){return  drivingCategory;}
    public String getDriverStatus(){return driverStatus;}


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
    public void setDrivingCategory(String drivingCategory){this.drivingCategory=drivingCategory;}

    public void setDriverStatus (String driverStatus){this.driverStatus = driverStatus;}

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
