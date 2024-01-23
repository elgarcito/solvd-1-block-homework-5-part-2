public class GasProduct {
    private String typeOfGas;// compressed gas or natural gas
    private double gasPressure;

    private String gasId;


    //Constructor

    public GasProduct(String typeOfGas, double gasPressure, String gasId) {
        this.typeOfGas = typeOfGas;
        this.gasPressure = gasPressure;
        this.gasId = gasId;
    }

    //End constructor

    //Getter and setters

    public String getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public double getGasPressure() {
        return gasPressure;
    }

    public void setGasPressure(double gasPressure) {
        this.gasPressure = gasPressure;
    }

    public String getGasId() {
        return gasId;
    }

    public void setGasId(String gasId) {
        this.gasId = gasId;
    }

    //end Getter and setters

}
