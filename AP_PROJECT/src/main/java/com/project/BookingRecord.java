package com.project;

import java.util.ArrayList;

public class BookingRecord {
    ArrayList<Booking> bookings;

    public BookingRecord() {
        bookings = new ArrayList<Booking>();
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean addBooking(Passenger pas, Flight fli, Employee rec, String seat) {
        Payment pay = Register.getCurrentBooking().getPayment();
        pay.setStatus("paid");
        Booking temp = new Booking(fli, pas, rec, this.generateID(), "booked", seat, pay);
        bookings.add(temp);
        System.out.println("hello this is booked");


        ArrayList<Integer> newSeats = new ArrayList<>();
        if (seat.equalsIgnoreCase(fli.getClasses().get(0))) {
            newSeats.add(0, fli.getSeats().get(0) - 1);
            newSeats.add(1, fli.getSeats().get(1));
            newSeats.add(2, fli.getSeats().get(2));
        } else if (seat.equalsIgnoreCase(fli.getClasses().get(1))) {
            newSeats.add(0, fli.getSeats().get(0));
            newSeats.add(1, fli.getSeats().get(1) - 1);
            newSeats.add(2, fli.getSeats().get(2));
        } else if (seat.equalsIgnoreCase(fli.getClasses().get(2))) {
            newSeats.add(0, fli.getSeats().get(0));
            newSeats.add(1, fli.getSeats().get(1));
            newSeats.add(2, fli.getSeats().get(2) - 1);
        }
        fli.setSeats(newSeats);
        ArrayList<Flight> fl = CommercialAirline.getReference().getRegister().getFlights().getFlights();
        for (int i = 0; i < fl.size(); i++) {
            if (fl.get(i).getFlightCode().equalsIgnoreCase(fli.getFlightCode())) {
                fl.get(i).setSeats(newSeats);
                break;
            }
        }
        return true;
    }

    public boolean removeBooking(String bookingID, Employee employee) {
        return true;
    }

    public boolean updateBooking(String bookingID, Booking updatedBooking, Employee employee) {
        return true;
    }

    public boolean processPayment(Booking b, int amount) {
        return true;
    }

    private String randomString(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public String generateID() {
        while (true) {
            String id = randomString(4);
            boolean dup = false;
            for (int i = 0; i < bookings.size(); i++) {
                if (bookings.get(i).getBookingID().equals(id)) {
                    dup = true;
                }
            }
            if (dup == false) {
                return id;
            }
        }
    }
}
