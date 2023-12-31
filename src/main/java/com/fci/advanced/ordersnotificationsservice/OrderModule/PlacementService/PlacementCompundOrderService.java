package com.fci.advanced.ordersnotificationsservice.OrderModule.PlacementService;//package com.fci.advanced.ordersnotificationsservice.OrderModule.PlacementService;
//
//import com.fci.advanced.ordersnotificationsservice.OrderModule.CompoundOrder;
//import com.fci.advanced.ordersnotificationsservice.OrderModule.Order;
//import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderService;
//
//import java.util.ArrayList;
//
//public class PlacementCompundOrderService implements PlacementService {
//
//    private ArrayList<Order>orders = new ArrayList<>() ;
//
//
//    public ArrayList<Order> getOrders() {
//        return orders;
//    }
//
//    @Override
//    public void placeOrder(Order order) {
//        CompoundOrder compoundOrder = (CompoundOrder) order;
//        ArrayList<Order> orders = compoundOrder.getOrders();
//
//        for (Order individualOrder : orders) {
//            individualOrder.execOrder();
//        }
//    }
//
//    @Override
//    public Order showDetails(Order order) {
//        CompoundOrder compoundOrder = (CompoundOrder) order;
//        ArrayList<Order> orders = compoundOrder.getOrders();
//
//        for (Order individualOrder : orders) {
//            individualOrder.execShowDetails();
//        }
//    }
//}
