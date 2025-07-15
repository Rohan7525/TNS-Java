package com.HybridInheri;

class Person {
    long phno;
    String name;

    public void PersonDetails() {
        System.out.println("Name: " + name + ", Phone: " + phno);
    }
}

class Employee extends Person {
    int empid;
    String position;
    float salary;

    public void EmployeeDetails() {
        System.out.println("Emp ID: " + empid + ", Position: " + position + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String authority;

    public void managerauthority() {
        System.out.println("Authority: " + authority);
    }
}

class Client extends Person {
    String bond;
    String projects;

    public void clientdetails() {
        System.out.println("Bond: " + bond + ", Projects: " + projects);
    }
}

public class Hybrid {
    public static void main(String[] args) {

        Manager mgr = new Manager();
        mgr.name = "Rohit";
        mgr.phno = 9876543210L;
        mgr.empid = 101;
        mgr.position = "Team Lead";
        mgr.salary = 85000.0f;
        mgr.authority = "Project Approval";

        System.out.println("---- Manager Details ----");
        mgr.PersonDetails();
        mgr.EmployeeDetails();
        mgr.managerauthority();

        System.out.println();

        Client client = new Client();
        client.name = "Ananya";
        client.phno = 9123456780L;
        client.bond = "6 Months";
        client.projects = "Banking App";

        System.out.println("---- Client Details ----");
        client.PersonDetails();
        client.clientdetails();
    }
}
