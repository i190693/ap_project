package com.project;

public class Person {

    private int age;
    private String gender;
    private String name;
    private String contactNumber;
    private String CNIC;

    public Person(){

    }
    public Person(int age, String gender, String name, String contactNumber, String CNIC) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.contactNumber = contactNumber;
        this.CNIC = CNIC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

}
