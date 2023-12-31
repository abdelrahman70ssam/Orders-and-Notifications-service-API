package com.fci.advanced.ordersnotificationsservice.CustomerModule;

import com.fci.advanced.ordersnotificationsservice.DBCustomer.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBSL {
    private LoginValidation loginValidation ;
    private CustomerDatabase customerDatabase ;

    private RegisterationValidation registerationValidation ;

    @Autowired
    public CustomerBSL(LoginValidation loginValidation, CustomerDatabase customerDatabase, RegisterationValidation registerationValidation) {
        this.loginValidation = loginValidation;
        this.customerDatabase = customerDatabase;
        this.registerationValidation = registerationValidation;
    }



    public void setLoginValidation(LoginValidation loginValidation) {
        this.loginValidation = loginValidation;
    }


    public void setCustomerDatabase(CustomerDatabase customerDatabase) {
        this.customerDatabase = customerDatabase;
    }


    public void setRegisterationValidation(RegisterationValidation registerationValidation) {
        this.registerationValidation = registerationValidation;
    }

    public LoginValidation getLoginValidation() {
        return loginValidation;
    }

    public CustomerDatabase getCustomerDatabase() {
        return customerDatabase;
    }

    public RegisterationValidation getRegisterationValidation() {
        return registerationValidation;
    }

    public String registerCustomer(Customer customer)
    {
        return registerationValidation.register(customer);
    }

    public void addCustomer(Customer customer){
        this.customerDatabase.addCustomerToDB(customer);
    }

    public void removeCustomer(Customer customer){
        this.customerDatabase.removeCustomerFromDB(customer);
    }
}
