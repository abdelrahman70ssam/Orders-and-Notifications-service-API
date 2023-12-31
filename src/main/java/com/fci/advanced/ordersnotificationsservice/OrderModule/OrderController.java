package com.fci.advanced.ordersnotificationsservice.OrderModule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OrderController {
    OrderBSL orderBSL;

    @Autowired
    public OrderController(OrderBSL orderBSL) {
        this.orderBSL = orderBSL;
    }

    @PostMapping(value = "/orders/simple")
    public ResponseEntity<String> placeSimpleOrderAPI(@RequestBody SimpleOrder simpleOrder) {
        boolean response = orderBSL.placeSimpleOrder(simpleOrder);
        if(response){
            return ResponseEntity.ok("Order placed Successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("invalid customer or insufficent balance");
    }


    @PostMapping(value = "/orders/compound")
    public ResponseEntity<String> placeCompundOrderAPI(@RequestBody SimpleOrder simpleOrder1 , SimpleOrder simpleOrder2) {
        boolean response = orderBSL.placeCompoundOrder(simpleOrder1 , simpleOrder2);
        if(response){
            return ResponseEntity.ok("Orders placed Successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("invalid customer or insufficent balance");
    }

    @GetMapping(value = "/orders/all")
    public ResponseEntity<ArrayList<String>> showOrderDetailsAPI(@RequestBody SimpleOrder simpleOrders) throws JsonProcessingException {
        ArrayList<ArrayList<Order>> orders = orderBSL.showOrdersDetails(simpleOrders);
        ArrayList<String>result = new ArrayList<>();
        for(ArrayList<Order> order : orders){
            for (Order order1: order) {
                ObjectMapper objectMapper = new ObjectMapper();
                String json = objectMapper.writeValueAsString(order1.toString());
                result.add(json);
            }
        }

        return ResponseEntity.ok(result);
    }




}
