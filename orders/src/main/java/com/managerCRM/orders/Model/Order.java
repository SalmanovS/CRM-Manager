package com.managerCRM.orders.Model;

import jakarta.persistence.*;

@Entity(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @Column(name = "order_number")
    private String orderNumber;
    @Column(name = "route_length")
    private int routeLength;
    @Column(name = "cargo_name")
    private String cargoName;
    @Column(name = "cargo_weight")
    private int cargoWeight;
    @Column(name = "departure_city")
    private String departureCity;
    @Column(name = "destination_city")
    private String destinationCity;
    @Column(name = "order_cost")
    private Double orderCost;

   private int carId;
   private int driverId;

    public Order(String orderNumber, int routeLength, String cargoName, int cargoWeight, String departureCity, String destinationCity, Double orderCost, int driverId, int carId) {
        this.orderNumber = orderNumber;
        this.routeLength = routeLength;
        this.cargoName = cargoName;
        this.cargoWeight = cargoWeight;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.orderCost = orderCost;
       this.driverId = driverId;
       this.carId = carId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public int getRouteLength() {
        return routeLength;
    }

    public String getCargoName() {
        return cargoName;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public Double getOrderCost() {
        return orderCost;
    }

    public int getDriverId() {
        return driverId;
    }

    public int getCarId() {
        return carId;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setRouteLength(int routeLength) {
        this.routeLength = routeLength;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public void setOrderCost(Double orderCost) {
        this.orderCost = orderCost;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", routeLength=" + routeLength +
                ", cargoName='" + cargoName + '\'' +
                ", cargoWeight=" + cargoWeight +
                ", departureCity='" + departureCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", orderCost=" + orderCost +
                ", driverId=" + driverId +
                ", carId=" + carId +
                '}';
    }
}
