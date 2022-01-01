package com.RohanSoni;
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
       if (this.age<0 || this.age>100){
           return 0;
       }
       else{
           return age;
       }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isTeen(){
        if (this.age>12 && this.age<20){
            return true;
        }
        else{
            return false;
        }
    }
    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        else if (this.firstName.isEmpty()){
            return this.lastName;
        }
        else if (this.lastName.isEmpty()){
            return this.firstName;
        }
        else {
            String fullName=this.firstName+" "+this.lastName;
            return fullName;
        }
    }
}
