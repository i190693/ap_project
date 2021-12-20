package com.project;

public class Passenger extends Person {


    private String visaNumber;
    private String passportNumber;

    public Passenger() {
        super();
    }

    public Passenger(int age, String gender, String name, String contactNumber, String CNIC, String visaNumber, String passportNumber) {
        super(age, gender, name, contactNumber, CNIC);
        this.visaNumber = visaNumber;
        this.passportNumber = passportNumber;
    }

    public String getVisaNumber() {
        return visaNumber;
    }

    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
