package com.company;

public class Customer {
    private String customerName;
    private  long contactNumber;
    private String emailId;
    private int age;


    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String name){
        this.customerName=name;
    }


    public long getContactNumber(){
        return contactNumber;
    }

    public void setContactNumber(long con){
        this.contactNumber=con;
    }

    public String getemailId(){
        return emailId;
    }

    public void setemailId(String eId){
        this.emailId=eId;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age1){
        this.age=age1;
    }

}
