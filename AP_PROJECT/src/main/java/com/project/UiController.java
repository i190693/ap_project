package com.project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;

public class UiController {

    @FXML
    private TableColumn<Flight, String> bookingTableCode;
    @FXML
    private TableColumn<Flight, String> bookingTableDestination;
    @FXML
    private TableColumn<Flight, String> bookingTableDeparture;
    @FXML
    private TableColumn<Flight, String> bookingTableDepartureTime;
    @FXML
    private TableColumn<Flight, String> bookingTableArrivalTime;
    @FXML
    private TableView<Flight> bookingTable;

    @FXML
    private TableColumn<Booking, String> viewBookingBID;
    @FXML
    private TableColumn<Booking, String> viewBookingFC;
    @FXML
    private TableColumn<Booking, String> viewBookingDate;
    @FXML
    private TableColumn<Booking, String> viewBookingName;
    @FXML
    private TableColumn<Booking, String> viewBookingDP;
    @FXML
    private TableColumn<Booking, String> viewBookingDS;
    @FXML
    private TableColumn<Booking, String> viewBookingAT;
    @FXML
    private TableColumn<Booking, String> viewBookingDPT;
    @FXML
    private TableColumn<Booking, String> viewBookingBB;
    @FXML
    private TableColumn<Booking, String> viewBookingSC;
    @FXML
    private TableColumn<Booking, Integer> viewBookingFR;
    @FXML
    private TableColumn<Booking, String> viewBookingSTA;
    @FXML
    private TableView<Booking> viewBookings;

    @FXML
    private TableColumn<Flight, String> viewFlightsFC;
    @FXML
    private TableColumn<Flight, String> viewFlightsDate;
    @FXML
    private TableColumn<Flight, String> viewFlightsFCF;
    @FXML
    private TableColumn<Flight, String> viewFlightsDP;
    @FXML
    private TableColumn<Flight, String> viewFlightsDS;
    @FXML
    private TableColumn<Flight, String> viewFlightsAT;
    @FXML
    private TableColumn<Flight, String> viewFlightsDPT;
    @FXML
    private TableColumn<Flight, String> viewFlightsFCS;
    @FXML
    private TableColumn<Flight, String> viewFlightsEF;
    @FXML
    private TableColumn<Flight, String> viewFlightsES;
    @FXML
    private TableColumn<Flight, String> viewFlightsBF;
    @FXML
    private TableColumn<Flight, String> viewFlightsBS;
    @FXML
    private TableColumn<Flight, String> viewFlightsName;
    @FXML
    private TableView<Flight> viewFlightsTable;

    @FXML
    private Text statusText;
    @FXML
    private TextField receptionistUsername;
    @FXML
    private TextField receptionistPassword;
    @FXML
    private TextField managerUsername;
    @FXML
    private TextField managerPassword;
    @FXML
    private TextField amountPaid;

    @FXML
    private TextField bookingCNIC;
    @FXML
    private TextField bookingName;
    @FXML
    private TextField bookingVisa;
    @FXML
    private TextField bookingPassport;
    @FXML
    private TextField bookingAge;
    @FXML
    private TextField bookingGender;
    @FXML
    private TextField bookingContact;
    @FXML
    private RadioButton bookingFC;
    @FXML
    private RadioButton bookingBS;
    @FXML
    private RadioButton bookingEC;
    @FXML
    private Label bookingFare;
    @FXML
    private static Text bookingFareCScr;
    @FXML
    private Text bookingChangeDue;

    @FXML
    private TextField searchFlightCode;


    @FXML
    private BorderPane root;

    private static String prev;


    public void managerClick() throws IOException {
        this.newWindow("manager_login.fxml");
    }

    public void receptionistClick() throws IOException {
        this.newWindow("receptionist_login.fxml");
    }

    public void receptionistLogInClick() throws IOException {
        CommercialAirline airline = CommercialAirline.getReference();
        String username = receptionistUsername.getText();
        String password = receptionistPassword.getText();
        boolean status = airline.logInAsReceptionist(username, password);
        if (status == true) {
            statusText.setText("");
            this.newWindow("receptionist_main_screen.fxml");
            prev = "main_screen.fxml";
        } else {
            statusText.setText("Username or Password Incorrect.\n Try Again.");
            return;
        }

    }


    public void changeBookingNextClick() throws IOException {
        this.newWindow("receptionist_change_booking_details_b.fxml");
        prev = "receptionist_main_screen.fxml";
        System.out.println("searched");
    }

    public void changeBookingSearchClick() throws IOException {
//        this.newWindow("receptionist_cancel_booking.fxml");
        prev = "receptionist_main_screen.fxml";
        System.out.println("searched");
    }

    public void cancelBookingSearchClick() throws IOException {
//        this.newWindow("receptionist_cancel_booking.fxml");
        prev = "receptionist_main_screen.fxml";
        System.out.println("searched");
    }

    public void changeBookingDetailsClick() throws IOException {
        this.newWindow("receptionist_change_booking_details.fxml");
        prev = "receptionist_main_screen.fxml";
        System.out.println("searched");
    }

    public void cancelBookingConfirmClick() throws IOException {
        this.newWindow("receptionist_cancel_booking_b.fxml");
        prev = "receptionist_main_screen.fxml";
    }

    public void cancelBookingClick() throws IOException {
        this.newWindow("receptionist_cancel_booking.fxml");
        prev = "receptionist_main_screen.fxml";
    }

    public void searchFlightClickWithoutCode() throws IOException {
//        this.newWindow("receptionist_main_screen.fxml");
        prev = "receptionist_main_screen.fxml";
        System.out.println("Flight Searched");
    }

    public void searchFlightClickWithCode() throws IOException {
//        this.newWindow("receptionist_make_booking_c.fxml");
        CommercialAirline airline = CommercialAirline.getReference();
        String code = searchFlightCode.getText();
        Flight temp = airline.getRegister().searchFlight(code);
        if (temp != null) {
            airline.getRegister().setCurrentFlight(temp);
            System.out.println(temp.getName());

            bookingTableCode.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("flightCode"));
            bookingTableDeparture.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("departure"));
            bookingTableDestination.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("destination"));
            bookingTableDepartureTime.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("departureTime"));
            bookingTableArrivalTime.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("arrivalTime"));
            ObservableList<Flight> data =
                    FXCollections.observableArrayList(
                            temp
                    );
            bookingTable.setItems(data);

            bookingFC.setText("First Class (" + temp.getSeats().get(0) + ")");
            bookingBS.setText("Business (" + temp.getSeats().get(1) + ")");
            bookingEC.setText("Economy (" + temp.getSeats().get(2) + ")");

        }
        System.out.println("Flight Searched" + code);
    }


    public void bookingFCClick() throws IOException {

        bookingEC.setSelected(false);
        bookingBS.setSelected(false);
        CommercialAirline airline = CommercialAirline.getReference();
        bookingFare.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(0));
//        bookingFareCScr.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(0));
        airline.getRegister().getCurrentBooking().getPayment().setAmount(airline.getRegister().getCurrentFlight().getFare().get(0));
        airline.getRegister().getCurrentBooking().setSeat(airline.getRegister().getCurrentFlight().getClasses().get(0));
    }

    public void bookingBSClick() throws IOException {
        bookingEC.setSelected(false);
        bookingFC.setSelected(false);
        CommercialAirline airline = CommercialAirline.getReference();
        bookingFare.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(1));
//        bookingFareCScr.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(1));
        airline.getRegister().getCurrentBooking().getPayment().setAmount(airline.getRegister().getCurrentFlight().getFare().get(1));
        airline.getRegister().getCurrentBooking().setSeat(airline.getRegister().getCurrentFlight().getClasses().get(1));
    }

    public void bookingECClick() throws IOException {
        bookingFC.setSelected(false);
        bookingBS.setSelected(false);
        CommercialAirline airline = CommercialAirline.getReference();
        bookingFare.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(2));
//        bookingFareCScr.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(2));
        airline.getRegister().getCurrentBooking().getPayment().setAmount(airline.getRegister().getCurrentFlight().getFare().get(2));
        airline.getRegister().getCurrentBooking().setSeat(airline.getRegister().getCurrentFlight().getClasses().get(2));
    }

    public void makeBookingNextPaymentClick() throws IOException {
        System.out.println("clicked");
        CommercialAirline airline = CommercialAirline.getReference();
        String seat = "";
        int idx = 0;
        if (bookingFC.isSelected()) {
            seat = "First Class";

        } else if (bookingBS.isSelected()) {

            idx = 1;
        } else if (bookingEC.isSelected()) {

            idx = 2;
        }
        System.out.println(airline.getRegister().getCurrentFlight().getFare().get(idx));
//        bookingFareCScr.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(idx));
        this.newWindow("receptionist_make_booking_c.fxml");
        prev = "receptionist_make_booking_b.fxml";
        bookingFareCScr = new Text();
        bookingFareCScr.setText("Rs. " + airline.getRegister().getCurrentFlight().getFare().get(idx));
        bookingFareCScr.setX(920);
        bookingFareCScr.setY(349);
        bookingFareCScr.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR, 18));
        root.getChildren().add(bookingFareCScr);
    }

    public void makeBookingBookTicketClick() throws IOException {

        bookingFareCScr.setText("");
        this.newWindow("receptionist_make_booking_d.fxml");
        prev = "receptionist_main_screen.fxml";
        CommercialAirline airline = CommercialAirline.getReference();
        airline.addBooking(Register.getCurrentPassenger(), Register.getCurrentFlight(), Register.getCurrentUser(), Register.getCurrentBooking().getSeat());

        System.out.println("booked" + airline.getRegister().getBookings().getBookings().get(0).getFlight().getFlightCode());
    }

    public void makeBookingProcessPaymentClick() throws IOException {
//        this.newWindow("receptionist_make_booking_c.fxml");
        String payment = amountPaid.getText();
        int paid = Integer.parseInt(payment);
        bookingChangeDue.setText("Rs. " + (paid - Register.getCurrentBooking().getPayment().getAmount()));
        System.out.println("payment processed");
    }


    public void makeBookingNextClickFlight() throws IOException {
        String name = bookingName.getText();
        String ageStr = bookingAge.getText();
        int age = Integer.parseInt(ageStr);
        String gender = bookingGender.getText();
        String CNIC = bookingCNIC.getText();
        String contact = bookingContact.getText();
        String visa = bookingVisa.getText();
        String passport = bookingPassport.getText();
        CommercialAirline airline = CommercialAirline.getReference();
        Passenger temp = airline.getCurrentPassenger();
        temp.setName(name);
        temp.setAge(age);
        temp.setGender(gender);
        temp.setContactNumber(contact);
        temp.setVisaNumber(visa);
        temp.setPassportNumber(passport);
        temp.setCNIC(CNIC);
        this.newWindow("receptionist_make_booking_b.fxml");
        prev = "receptionist_make_booking_a.fxml";

    }

    public void makeBookingClick() throws IOException {
        Person obj;
        this.newWindow("receptionist_make_booking_a.fxml");
        prev = "receptionist_main_screen.fxml";
    }

    public void searchFlightClick() throws IOException {
        this.newWindow("receptionist_flight_search.fxml");
        prev = "receptionist_main_screen.fxml";
    }

    public void managerLogInClick() throws IOException {
        CommercialAirline airline = CommercialAirline.getReference();
        String username = managerUsername.getText();
        String password = managerPassword.getText();
        boolean status = airline.logInAsManager(username, password);
        if (status == true) {
            this.newWindow("manager_main_screen.fxml");
            prev = "main_screen.fxml";
        } else {
            statusText.setText("Username or Password Incorrect.\n Try Again.");
            return;
        }

    }

    public void addFlightClick() throws IOException {
        this.newWindow("manager_add_flight.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void addFlightAddClick() throws IOException {
        this.newWindow("manager_add_flight_b.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void removeFlightClick() throws IOException {
        this.newWindow("manager_remove_flight.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void removeFlightRemoveClick() throws IOException {
        this.newWindow("manager_remove_flight_b.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void addStaffClick() throws IOException {
        this.newWindow("manager_add_staff.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void addStaffAddClick() throws IOException {
        this.newWindow("manager_add_staff_b.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void removeStaffClick() throws IOException {
        this.newWindow("manager_remove_staff.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void removeStaffRemoveClick() throws IOException {
        this.newWindow("manager_remove_staff_b.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void viewBookingsViewClick() {
        CommercialAirline airline = CommercialAirline.getReference();
        ArrayList<Booking> temp = airline.getRegister().getBookings().getBookings();
        if (temp != null) {

            viewBookingBB.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("name"));
            viewBookingDP.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("dpt"));
            viewBookingDPT.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("dptTime"));
            viewBookingAT.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("arrTime"));
            viewBookingBID.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("bookingID"));
            viewBookingDS.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("dst"));
            viewBookingDate.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("date"));
            viewBookingName.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("name"));
            viewBookingSC.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("seat"));
            viewBookingFR.setCellValueFactory(
                    new PropertyValueFactory<Booking, Integer>("fare"));
            viewBookingSTA.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("status"));
            viewBookingFC.setCellValueFactory(
                    new PropertyValueFactory<Booking, String>("code"));
            ObservableList<Booking> data =
                    FXCollections.observableArrayList(

                    );
            for (int i = 0; i < temp.size(); i++) {
                data.add(temp.get(i));
            }
            viewBookings.setItems(data);
        }
    }

    public void viewBookingsClick() throws IOException {
        this.newWindow("manager_view_bookings.fxml");
        prev = "manager_main_screen.fxml";

    }

    public void viewFlightsClick() throws IOException {
        this.newWindow("manager_view_flights.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void viewFlightsViewClick() {
        CommercialAirline airline = CommercialAirline.getReference();
        ArrayList<Flight> temp = airline.getRegister().getFlights().getFlights();
        if (temp != null) {
            viewFlightsFC.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("flightCode"));
            viewFlightsDP.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("departure"));
            viewFlightsDPT.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("departureTime"));
            viewFlightsAT.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("arrivalTime"));
            viewFlightsDS.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("destination"));
            viewFlightsDate.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("date"));
            viewFlightsName.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("name"));
            viewFlightsFCS.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("fcs"));
            viewFlightsFCF.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("fcf"));
            viewFlightsES.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("es"));
            viewFlightsEF.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("ef"));
            viewFlightsBF.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("bf"));
            viewFlightsBS.setCellValueFactory(
                    new PropertyValueFactory<Flight, String>("bs"));
            ObservableList<Flight> data =
                    FXCollections.observableArrayList(

                    );
            for (int i = 0; i < temp.size(); i++) {
                data.add(temp.get(i));
            }
            viewFlightsTable.setItems(data);
        }
    }

    public void viewStaffClick() throws IOException {
        this.newWindow("manager_view_staff.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void updateFlightClick() throws IOException {
        this.newWindow("manager_update_flight.fxml");
        prev = "manager_main_screen.fxml";
    }

    public void updateFlightUpdateClick() throws IOException {
        this.newWindow("manager_update_flight_b.fxml");
        prev = "manager_main_screen.fxml";
    }


    public void backClick() throws IOException {
        this.goBack();
    }

    public void newWindow(String fxmlFileName) throws IOException, IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        BorderPane border = new BorderPane(fxmlLoader.load());
        root.getChildren().setAll(border);

    }

    public void goBack() throws IOException {
        if (prev == null) {
            prev = "main_screen.fxml";
        }

        System.out.println(prev);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(prev));
        BorderPane border = new BorderPane(fxmlLoader.load());
        root.getChildren().setAll(border);

        if (prev.equals("receptionist_make_booking_c.fxml")) {
            prev = "receptionist_make_booking_b.fxml";
        } else if (prev.equals("receptionist_make_booking_d.fxml")) {
            prev = "receptionist_main_screen.fxml";
        } else if (prev.equals("receptionist_make_booking_b.fxml")) {
            prev = "receptionist_make_booking_a.fxml";
        } else if (prev.equals("receptionist_make_booking_a.fxml")) {
            prev = "receptionist_main_screen.fxml";
        } else if (prev.equals("receptionist_main_screen.fxml")) {
            prev = "receptionist_login.fxml";
        } else if (prev.equals("receptionist_login.fxml")) {
            prev = "main_screen.fxml";
        } else if (prev.equals("receptionist_cancel_booking.fxml")) {
            prev = "receptionist_main_screen.fxml";
        } else if (prev.equals("receptionist_cancel_booking_b.fxml")) {
            prev = "receptionist_main_screen.fxml";
        } else if (prev.equals("receptionist_change_booking_b.fxml")) {
            prev = "receptionist_main_screen.fxml";
        } else if (prev.equals("receptionist_change_booking.fxml")) {
            prev = "receptionist_main_screen.fxml";
        } else if (prev.equals("manager_main_screen.fxml")) {
            prev = "main_screen.fxml";
        }
    }
}
