package com.RohanSoni;

public class Main {

    public static void main(String[] args) {
    Customer customer=new Customer("rohan soni",
            "919650173057",
            "rohansoni54476@gmail.com",
            "88******32",
            "Mamura, sector-66,Noida-201301",
            1000);

    Customer customer1=new Customer();

    customer.withdrawal(20000);
    customer.deposit(10000);
    customer.withdrawal(1500);


    String defaultAddress=customer1.getAddress();
    String defaultName=customer1.getName();
    String defaultEmailAddress = customer1.getEmailAddress();

        System.out.println("customer name : "+defaultName+
                ", customer email address : "+defaultEmailAddress+
                ", customer address : "+defaultAddress);

    customer1.withdrawal(20000);
    customer1.deposit(10000);
    customer1.withdrawal(1500);


    VipCustomer rohan=new VipCustomer();
    String rohanCustomerName=rohan.getCustomerName();
        System.out.println(rohanCustomerName);

        VipCustomer muskan=new VipCustomer("muskan soni",
                10000);
        String muskanCustomerName=muskan.getCustomerName();
        String muskanCustomerEmailAddress=muskan.getCustomerEmailAddress();
        System.out.println("customer name "+muskanCustomerName+
                ", customer email address"+muskanCustomerEmailAddress +
                ", credit limit " + muskan.getCustomerCreditLimit());

        VipCustomer ayushi=new VipCustomer("Ayushi soni",
                "ayushi123@gmail.com");

        System.out.println("customer name "+ayushi.getCustomerName());
        System.out.println("customer email address "+ayushi.getCustomerEmailAddress());
        System.out.println("customer credit limit "+ayushi.getCustomerCreditLimit());

    }

}
