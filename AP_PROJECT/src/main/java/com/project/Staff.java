package com.project;

import java.util.ArrayList;

public class Staff {
    public Staff() {
        employees = new ArrayList<Employee>();
    }

    private ArrayList<Employee> employees;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


    public boolean addMember(Employee e) {
        employees.add(e);
        return true;
    }

    public boolean removeMember(Employee e) {
        employees.remove(e);
        return true;
    }

    public boolean verifyManager(String username, String password) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUsername().equals(username)) {
                if (employees.get(i).getPassword().equals(password)) {
                    if (employees.get(i).getRole().equalsIgnoreCase("manager")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean verifyReceptionist(String username, String password) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUsername().equals(username)) {
                if (employees.get(i).getPassword().equals(password)) {
                    if (employees.get(i).getRole().equalsIgnoreCase("receptionist")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
