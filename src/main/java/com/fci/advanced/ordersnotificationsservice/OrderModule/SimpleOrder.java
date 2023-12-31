package com.fci.advanced.ordersnotificationsservice.OrderModule;

import com.fci.advanced.ordersnotificationsservice.CustomerModule.Customer;
import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderService;
import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderValidationService;
import com.fci.advanced.ordersnotificationsservice.StoreModule.Product;

import java.util.ArrayList;


public class SimpleOrder extends Order{


    protected Customer customer;
    protected ArrayList<Product>products;
     private boolean orderStatus ;
     private  double Cost , ShippingFees;


//    @Autowired
    public SimpleOrder(Customer customer, ArrayList<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public void setShippingFees(double shippingFees) {
        ShippingFees = shippingFees;
    }

    public double getShippingFees() {
        return ShippingFees;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public double getCost() {
        return Cost;
    }


    @Override
    public void placeOrder() {
        if(orderService instanceof OrderValidationService orderValidationService){

            double customerBalance = this.customer.getBalance();
            double totalCost =  orderValidationService.isBalanceSufficient(this);

            if(orderValidationService.validateCustomer(this) && totalCost <= customerBalance &&
                orderValidationService.isValidProduct(this)){
//                this.getCustomer().setBalance(customerBalance - totalCost);
                this.setCost(totalCost);
                this.orderStatus = true;
            }
            else{
                this.orderStatus = false ;
            }
        }
    }

    @Override
    public boolean isOrderStatus() {
        return this.orderStatus;
    }

    @Override
    public ArrayList<Order> getDetailsofOrder() {
        ArrayList<Order>orders = new ArrayList<>();
        orders.add(this);
        return orders;
    }

    @Override
    public String toString() {
        return "SimpleOrder{" +
                "customer=" + customer.toString() +
                ", products=" + products.toString() +
                ", orderStatus=" + orderStatus +
                ", Cost=" + Cost +
                '}';
    }
}
