package com.mahesh.springboot.jpa.dao;

public class Customer {

    private String customerId;
    private String fName;
    private String lName;
    private String accountType;
    private String accountBalance;

    public Customer(String customerId, String fName, String lName, String accountType, String accountBalance) {
        this.customerId = customerId;
        this.fName = fName;
        this.lName = lName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
}
