package com.project;

import java.util.ArrayList;

public class FlightCatalog {
    public FlightCatalog() {
        flights = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    private ArrayList<Flight> flights;

    public ArrayList<Flight> searchFlight(String departure, String destination) {
        return null;
    }

    public boolean addFlight(Flight f) {
      flights.add(f);
      return true;
    }

    public boolean removeFlight(Flight f) {
        flights.remove(f);
        return true;
    }

    public boolean updateFlight(Flight old, Flight updated) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightCode().equalsIgnoreCase(old.getFlightCode())) {
                old=updated;
            return true;
            }
        }
        return false;
    }

    public void viewFlights() {
    }

    public void viewBookings() {
    }

    public Flight searchFlight(String code) {

        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i).getFlightCode());
            if (flights.get(i).getFlightCode().equalsIgnoreCase(code)) {
                return flights.get(i);
            }
        }
        return null;
    }
}
