package com.fci.advanced.ordersnotificationsservice.OrderModule;

import java.util.ArrayList;


public class CompoundOrder extends Order {

    private  ArrayList<Order>orders = new ArrayList<>();
    private ArrayList<ArrayList<Order>>detailsList = new ArrayList<>();



    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    @Override
    public void placeOrder(){
        for (Order order : orders) {
            order.placeOrder();
        }
    }

    @Override
    public boolean isOrderStatus() {
        for (Order order : orders) {
            if(!order.isOrderStatus()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ArrayList<Order> getDetailsofOrder() {
        ArrayList<ArrayList<Order>> list = new ArrayList<>();
        for (Order order : orders) {
            list.add(order.getDetailsofOrder());
        }
        this.detailsList = list;
        return null;
    }

    public ArrayList<ArrayList<Order>> getDetailsList() {
        return detailsList;
    }
}

