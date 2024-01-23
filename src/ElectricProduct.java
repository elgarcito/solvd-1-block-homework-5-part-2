
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ElectricProduct {
    private double voltageRate;//The voltage admitted for the product in V (volts)
    private double power;//The power consumed for the product in kW (kiloWatt)
    private String electricId;//The id of the product



    //Constructor

    public ElectricProduct(double voltageRate, double power, String electricId) {
        this.voltageRate = voltageRate;
        this.power = power;
        this.electricId = electricId;
    }

    //End constructor

    //Getters and setters
    public double getVoltageRate() {
        return voltageRate;
    }

    public void setVoltageRate(double voltageRate) {
        this.voltageRate = voltageRate;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getElectricId() {
        return electricId;
    }

    public void setElectricId(String electricId) {
        this.electricId = electricId;
    }

    //End Getters and setters

}





