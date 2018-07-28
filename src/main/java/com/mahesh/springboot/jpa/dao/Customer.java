package com.mahesh.springboot.jpa.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Customer")
public class Customer {

    private Long customerId;
    private String fName;
    private String lName;
    private String accountType;
    private String accountBalance;

    public Customer(Long customerId, String fName, String lName, String accountType, String accountBalance) {
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
    @Id
    @Column(name = "customer_Id", insertable = false, updatable = false)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Column(name = "f_Name")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Column(name = "l_Name")
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Column(name = "account_Type")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Column(name = "account_Balance")
    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
}
