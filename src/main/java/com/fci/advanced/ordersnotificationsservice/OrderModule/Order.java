package com.fci.advanced.ordersnotificationsservice.OrderModule;


import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderService;

import java.util.ArrayList;

public abstract class Order {

    protected OrderService orderService ;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public abstract void placeOrder();
    public abstract boolean isOrderStatus();
    public abstract ArrayList<Order> getDetailsofOrder();


}
