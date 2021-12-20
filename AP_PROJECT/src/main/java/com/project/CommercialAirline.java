package com.project;

import java.util.ArrayList;

public class CommercialAirline {

    private static Register register;
    private static CommercialAirline airline;

    private CommercialAirline() {
        register = new Register();
    }

    public static CommercialAirline getReference() {
        if (airline == null) {
            airline = new CommercialAirline();
        }
        return airline;
    }

    public boolean logInAsManager(String username, String password) {
        return register.logInAsManager(username, password);
    }

    public boolean logInAsReceptionist(String username, String password) {
        return register.logInAsReceptionist(username, password);

    }

    public boolean addBooking(Passenger pas, Flight fli, Employee rec, String seat) {
        return register.addBooking(pas, fli, rec, seat);
    }

    public boolean removeBooking(String bookingID, Employee employee) {
        return   register.removeBooking(bookingID, employee);

    }

    public boolean updateBooking(String bookingID, Booking updatedBooking, Employee employee) {
        return register.updateBooking(bookingID, updatedBooking, employee);

    }

    public ArrayList<Flight> searchFlights(String departure, String destination) {
        return register.searchFlight(departure, destination);

    }

    public boolean addFlight(Flight f) {
        return register.addFlight(f);

    }

    public boolean removeFlight(Flight f) {
        return register.removeFlight(f);

    }

    public boolean updateFlight(Flight old, Flight updated) {
        return register.updateFlight(old, updated);

    }

    public boolean addStaffMember(Employee e) {
        return register.addStaffMember(e);

    }

    public boolean removeStaffMember(Employee e) {
        return register.removeStaffMember(e);

    }

    public void viewFlights() {
        register.viewFlights();
    }

    public void viewBookings() {
        register.viewBookings();
    }

    public boolean verifyPassenger(Passenger p) {
        return register.verifyPassenger(p);
    }

    public boolean processPayment(Booking b, int amount) {
        return register.processPayment(b, amount);
    }

    public static Passenger getCurrentPassenger() {
        return register.getCurrentPassenger();
    }

    public static void setCurrentPassenger(Passenger currentPassenger) {
        Register.setCurrentPassenger(currentPassenger);
    }

    public static Flight getCurrentFlight() {
        return register.getCurrentFlight();
    }

    public static void setCurrentFlight(Flight currentFlight) {
        Register.setCurrentFlight(currentFlight);
    }

    public static Employee getCurrentUser() {
        return register.getCurrentUser();
    }

    public static void setCurrentUser(Employee currentUser) {
        Register.setCurrentUser(currentUser);
    }

    public static Register getRegister() {
        return register;
    }


}
