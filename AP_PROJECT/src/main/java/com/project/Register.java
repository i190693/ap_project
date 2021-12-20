package com.project;

import java.util.ArrayList;

public class Register {
    private BookingRecord bookings;


    private FlightCatalog flights;
    private Staff staff;


    public static void setCurrentPassenger(Passenger currentPassenger) {
        Register.currentPassenger = currentPassenger;
    }

    public static Booking getCurrentBooking() {
        return currentBooking;
    }

    public static void setCurrentBooking(Booking currentBooking) {
        Register.currentBooking = currentBooking;
    }

    private static Employee currentUser;
    private static Flight currentFlight;
    private static Passenger currentPassenger;
    private static Booking currentBooking;

    public Register() {
        bookings = new BookingRecord();
        flights = new FlightCatalog();
        staff = new Staff();
        currentFlight = new Flight();
        currentPassenger = new Passenger();
        currentUser = new Employee();
        currentBooking = new Booking();
    }

    public boolean addBooking(Passenger pas, Flight fli, Employee rec, String seat) {
        return bookings.addBooking(pas, fli, rec, seat);

    }


    public boolean removeBooking(String bookingID, Employee employee) {
        return bookings.removeBooking(bookingID, employee);

    }

    public boolean updateBooking(String bookingID, Booking updatedBooking, Employee employee) {
        return bookings.updateBooking(bookingID, updatedBooking, employee);

    }

    public ArrayList<Flight> searchFlight(String departure, String destination) {
        return flights.searchFlight(departure, destination);

    }

    public Flight searchFlight(String code) {
        return flights.searchFlight(code);
    }


    public boolean logInAsManager(String username, String password) {
        if (username.length() == 0 || password.length() == 0) {
            System.out.println("length is zero");
            return false;
        } else {
            System.out.println(username + " : " + password);
            return staff.verifyManager(username, password);
        }
    }

    public boolean logInAsReceptionist(String username, String password) {
        if (username.length() == 0 || password.length() == 0) {
            System.out.println("length is zero");
            return false;
        } else {
            System.out.println(username + " : " + password);
            return staff.verifyReceptionist(username, password);
        }
    }

    public boolean addFlight(Flight f) {
        flights.addFlight(f);
        return true;
    }

    public boolean removeFlight(Flight f) {
        flights.removeFlight(f);
        return true;
    }

    public boolean updateFlight(Flight old, Flight updated) {
        flights.updateFlight(old, updated);
        return true;
    }

    public boolean addStaffMember(Employee e) {
        staff.addMember(e);
        return true;
    }

    public boolean removeStaffMember(Employee e) {
        staff.removeMember(e);
        return true;
    }

    public void viewFlights() {
        flights.viewFlights();
    }

    public void viewBookings() {
        flights.viewBookings();
    }

    public boolean verifyPassenger(Passenger p) {
        return true;
    }

    public boolean processPayment(Booking b, int amount) {
        bookings.processPayment(b, amount);
        return true;
    }

    public static Employee getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(Employee currentUser) {
        Register.currentUser = currentUser;
    }

    public static Flight getCurrentFlight() {
        return currentFlight;
    }

    public static void setCurrentFlight(Flight currentFlight) {
        Register.currentFlight = currentFlight;
    }

    public static Passenger getCurrentPassenger() {
        return currentPassenger;
    }

    public BookingRecord getBookings() {
        return bookings;
    }

    public void setBookings(BookingRecord bookings) {
        this.bookings = bookings;
    }

    public FlightCatalog getFlights() {
        return flights;
    }

    public void setFlights(FlightCatalog flights) {
        this.flights = flights;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
