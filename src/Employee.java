import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Employee  {

    private String personalId;//The personal id of the worker
    private double costPerHour;//The pay per hour of the worker
    private String speciality;//What kind of job the worker does
    private int employeeAge;//how old is the employee


    //Constructor

    public Employee(String personalId, double costPerHour, String speciality) {
        this.personalId = personalId;
        this.costPerHour = costPerHour;
        this.speciality = speciality;
    }


    //End constructor

    //Getter and setters

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
    //end getters and setters

}
