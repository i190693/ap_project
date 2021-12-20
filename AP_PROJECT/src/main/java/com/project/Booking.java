package com.project;

public class Booking {

    Flight flight;
    Passenger passenger;
    Employee receptionist;
    String bookingID;
    String status;
    String seat;
    Payment payment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getDptTime() {
        return dptTime;
    }

    public void setDptTime(String dptTime) {
        this.dptTime = dptTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String name;
    private String dpt;
    private String date;
    private String dst;
    private String dptTime;
    private String arrTime;
    private int fare;
    private String bb;



    private String code;
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Employee getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Employee receptionist) {
        this.receptionist = receptionist;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Booking(Flight flight, Passenger passenger, Employee receptionist, String bookingID, String status, String seat, Payment payment) {
        this.flight = flight;
        this.passenger = passenger;
        this.receptionist = receptionist;
        this.bookingID = bookingID;
        this.status = status;
        this.seat = seat;
        this.payment = payment;
        this.dpt = this.flight.getDeparture();
        this.dst = this.flight.getDestination();
        this.arrTime = this.flight.getArrivalTime();
        this.dptTime = this.flight.getDepartureTime();
        this.name = this.passenger.getName();
        this.fare = this.payment.getAmount();
        this.bb = this.receptionist.getName();
        this.date = this.flight.getDate();
        this.code=this.flight.getFlightCode();
    }


    public Booking() {
        payment = new CashPayment();
    }
}
