package com.fci.advanced.ordersnotificationsservice.CustomerModule;


public class Customer {
    private String name;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private final String location;
    private double balance ;
    private boolean accountStatus ;

    public Customer(String name, String username, String password, String email, String phoneNumber, String location, double balance, boolean accountStatus) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.balance = balance;
        this.accountStatus = true;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNubmer() {
        return phoneNumber;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNubmer(String phoneNubmer) {
        this.phoneNumber = phoneNubmer;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location='" + location + '\'' +
                ", balance=" + balance +
                ", accountStatus=" + accountStatus +
                '}';
    }
}
