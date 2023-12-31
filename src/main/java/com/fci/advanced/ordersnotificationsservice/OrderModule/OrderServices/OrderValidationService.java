package com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices;


import com.fci.advanced.ordersnotificationsservice.CustomerModule.Customer;
import com.fci.advanced.ordersnotificationsservice.DBCustomer.CustomerDatabase;
import com.fci.advanced.ordersnotificationsservice.OrderModule.SimpleOrder;
import com.fci.advanced.ordersnotificationsservice.StoreModule.Product;
import com.fci.advanced.ordersnotificationsservice.StoreModule.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderValidationService extends OrderService {

    CustomerDatabase customerDatabase;
    Store store ;

    @Autowired
    public OrderValidationService(CustomerDatabase customerDatabase, Store store) {
        this.customerDatabase = customerDatabase;
        this.store = store;
    }

    public boolean isValidProduct(SimpleOrder simpleOrder)
    {
        ArrayList<Product>storeProducts = store.getProducts();
        for (Product product : simpleOrder.getProducts()) {
            boolean found = false;
            for(Product product1 : storeProducts){
                if(product1.getSerialNO().equals(product.getSerialNO())){
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }

        return true;
    }

    public boolean validateCustomer(SimpleOrder order)
    {
        String username = order.getCustomer().getUsername() , password = order.getCustomer().getPassword();
        Customer customer = customerDatabase.searchAccount(username,password) ;
        if(customer.getUsername().equals(username)
                && customer.getPassword().equals(password) &&  customer.isAccountStatus()){
            return true;
        }
        return false;
    }

    public double isBalanceSufficient(SimpleOrder order)
    {
        ArrayList<Product> products = order.getProducts();
        double totalCost = 0.0 ;
        for (Product product : products) {
            totalCost += product.getPrice();
        }

        return totalCost ;
    }

}
