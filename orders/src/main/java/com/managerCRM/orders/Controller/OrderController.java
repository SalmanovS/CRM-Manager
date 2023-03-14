package com.managerCRM.orders.Controller;

import com.managerCRM.orders.Model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/")
public class OrderController {

    @GetMapping("orders/directionsApi/{startLocation}-{endLocation}")
    public Long directionsApi(@PathVariable String startLocation, @PathVariable String endLocation){
        String startAddress = startLocation.replaceAll(" ","+");
        String endAddress = endLocation.replaceAll(" ","+" );
        String url = "https://maps.googleapis.com/maps/api/directions/json?origin="+startAddress+"&destination="+endAddress+"&key=AIzaSyC9Txy-V6PZTtv2fQRxcYBBW0eESWP5Rfk";
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(url, Response.class);
        return response.getRoutes()[0].getLegs()[0].getDistance().getValue();

    }
}
