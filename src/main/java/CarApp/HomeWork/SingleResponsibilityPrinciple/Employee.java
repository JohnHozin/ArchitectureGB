package CarApp.HomeWork.SingleResponsibilityPrinciple;

import java.util.Date;

public class Employee {
    // Single Responsibility Principle
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
