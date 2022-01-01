package com.RohanSoni;

public class VipCustomer {
    private String customerName;
    private String customerEmailAddress;
    private double customerCreditLimit;


    public VipCustomer(){
        this("default name","default@gmail.com",25000);
    }

    public VipCustomer(String customerName,double customerCreditLimit){
        this(customerName,"default123@gmail.com",customerCreditLimit);
    }
    public VipCustomer(String customerName,String customerEmailAddress){
        this(customerName,50000);
    }
    public VipCustomer(String customerName,String customerEmailAddress,double customerCreditLimit){
        this.customerCreditLimit=customerCreditLimit;
        this.customerEmailAddress=customerEmailAddress;
        this.customerName=customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmailAddress(){
        return this.customerEmailAddress;
    }
    public double getCustomerCreditLimit(){
        return this.customerCreditLimit;
    }
}
