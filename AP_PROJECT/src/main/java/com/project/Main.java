package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main_screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("Commercial Airline System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        CommercialAirline airline = CommercialAirline.getReference();
        Employee e = new Employee(17, "Male", "Ejaz", "01234", "CNIC123", "Manager", "manager", "manager", "manager@airline.com", "M1");
        airline.addStaffMember(e);
        e = new Employee(17, "Male", "Ejaz", "01234", "CNIC123", "Manager", "a", "a", "manager@airline.com", "M1");
        airline.addStaffMember(e);
        e = new Employee(20, "Female", "Javaria", "2222", "CNIC222", "Receptionist", "javaria", "1234", "javaria@airline.com", "R1");
        airline.addStaffMember(e);

        Passenger p = new Passenger();
        p.setName("lily");

        Employee e2 = new Employee(69, "WOW", "idk", "1", "1", "Receptionist", "a", "a", "a@airline.com", "R2");
        airline.addStaffMember(e2);
        ArrayList<Integer> seats = new ArrayList<>();
        seats.add(10);
        seats.add(20);
        seats.add(30);

        ArrayList<Integer> fare = new ArrayList<>();
        fare.add(200);
        fare.add(150);
        fare.add(100);

        ArrayList<String> classes = new ArrayList<>();
        classes.add("First Class");
        classes.add("Business");
        classes.add("Economy");

        Flight f = new Flight("AB12", "AirBlue", "LHR", "ISB", "0700", "1000", seats, fare, classes, "20-12-2021");

        airline.addFlight(f);

        fare = new ArrayList<>();
        fare.add(2000);
        fare.add(1500);
        fare.add(1000);

        seats = new ArrayList<>();
        seats.add(7);
        seats.add(10);
        seats.add(12);

        f = new Flight("ET01", "Ettihad", "ISB", "KHI", "1200", "2400", seats, fare, classes, "21-12-2021");

        airline.addFlight(f);
        airline.addBooking(p,f,e,"Economy");

        launch();
    }
}