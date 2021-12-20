package com.project;

import java.util.ArrayList;

public class Flight {

    private String flightCode;
    private String name;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String date;


    private ArrayList<Integer> seats;
    private ArrayList<Integer> fare;
    private ArrayList<String> classes;


    private String es;
    private String ef;
    private String bs;
    private String bf;
    private String fcf;
    private String fcs;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Flight(String flightCode, String name, String departure, String destination, String departureTime, String arrivalTime, ArrayList<Integer> seats, ArrayList<Integer> fare, ArrayList<String> classes, String date) {
        this.flightCode = flightCode;
        this.name = name;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seats = seats;
        this.fare = fare;
        this.classes = classes;
        this.date = date;
        this.fcf = this.fare.get(0) + "";
        this.bf = this.fare.get(1) + "";
        this.ef = this.fare.get(2) + "";
        this.fcs = this.seats.get(0) + "";
        this.bs = this.seats.get(1) + "";
        this.es = this.seats.get(2) + "";
    }

    public Flight() {
        seats = new ArrayList<>();
        fare = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Integer> seats) {
        this.seats = seats;
    }

    public ArrayList<Integer> getFare() {
        return fare;
    }

    public void setFare(ArrayList<Integer> fare) {
        this.fare = fare;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getEf() {
        return ef;
    }

    public void setEf(String ef) {
        this.ef = ef;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getBf() {
        return bf;
    }

    public void setBf(String bf) {
        this.bf = bf;
    }

    public String getFcf() {
        return fcf;
    }

    public void setFcf(String fcf) {
        this.fcf = fcf;
    }

    public String getFcs() {
        return fcs;
    }

    public void setFcs(String fcs) {
        this.fcs = fcs;
    }

}
