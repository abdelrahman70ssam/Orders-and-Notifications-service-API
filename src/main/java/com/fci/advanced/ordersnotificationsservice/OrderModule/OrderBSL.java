package com.fci.advanced.ordersnotificationsservice.OrderModule;


import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderBSL {

    private  OrderValidationService validationService ;

    @Autowired
    public OrderBSL(OrderValidationService validationService) {
        this.validationService = validationService;
    }


//    public boolean placeSimpleOrder(SimpleOrder order){
//        order.setOrderService(new OrderValidationService(customerDatabase));
//        order.placeOrder();
//        return order.isOrderStatus() ;
//    }
//
//
//    public boolean placeCompundOrder(SimpleOrder simpleOrder1 , SimpleOrder simpleOrder2){
//        simpleOrder1.setOrderService(new OrderValidationService(customerDatabase));
//        simpleOrder2.setOrderService(new OrderValidationService(customerDatabase));
//
//        CompoundOrder order = new CompoundOrder();
//        order.addOrder(simpleOrder1);
//        order.addOrder(simpleOrder2);
//
//        order.placeOrder();
//        return simpleOrder1.isOrderStatus() && simpleOrder2.isOrderStatus();
//    }

    public boolean placeSimpleOrder(Order ...orders)
    {
        CompoundOrder compoundOrder = new CompoundOrder();
        for (Order order : orders) {
            order.setOrderService(this.validationService);
            compoundOrder.addOrder(order);
        }
        compoundOrder.placeOrder();
        return compoundOrder.isOrderStatus();
    }

    public boolean placeCompoundOrder(SimpleOrder simpleOrder1 , SimpleOrder simpleOrder2)
    {
        CompoundOrder compoundOrder = new CompoundOrder();
        simpleOrder1.setOrderService(this.validationService);
        simpleOrder2.setOrderService(this.validationService);
        compoundOrder.addOrder(simpleOrder1);
        compoundOrder.addOrder(simpleOrder2);

        compoundOrder.placeOrder();
        return compoundOrder.isOrderStatus();
    }

    public ArrayList<ArrayList<Order>> showOrdersDetails(Order ...orders){
        CompoundOrder compoundOrder = new CompoundOrder();
        for (Order order : orders) {
            order.setOrderService(this.validationService);
            compoundOrder.addOrder(order);
        }
        compoundOrder.getDetailsofOrder();
        return compoundOrder.getDetailsList();
//        compoundOrder.
    }




}
