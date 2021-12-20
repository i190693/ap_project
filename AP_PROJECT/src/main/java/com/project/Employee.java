package com.project;

public class Employee extends Person {


    private String role;
    private String username;
    private String password;
    private String email;
    private String empID;

    public Employee()
    {
        super();
    }

    public Employee(int age, String gender, String name, String contactNumber, String CNIC, String role, String username, String password, String email, String empID) {
        super(age, gender, name, contactNumber, CNIC);
        this.role = role;
        this.email = email;
        this.username = username;
        this.password = password;
        this.empID = empID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
