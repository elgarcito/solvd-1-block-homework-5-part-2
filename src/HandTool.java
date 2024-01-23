
public class HandTool  {
    private boolean itCut;//If it cut like a knife, hand saw or axe
    private boolean weatherProof;//if it is weatherproof
    private boolean electricIsolated;//if it is or not electrically isolated
    private String batteryType;//if it uses a battery and which type
    private boolean oneHand;//if it uses one or two hands


    //Constructor

    public HandTool(boolean itCut, boolean weatherProof, boolean electricIsolated) {
        this.itCut = itCut;
        this.weatherProof = weatherProof;
        this.electricIsolated = electricIsolated;
    }

    //End constructor

    //getter and setter

    public boolean isItCut() {
        return itCut;
    }

    public void setItCut(boolean itCut) {
        this.itCut = itCut;
    }

    public boolean isWeatherProof() {
        return weatherProof;
    }

    public void setWeatherProof(boolean weatherProof) {
        this.weatherProof = weatherProof;
    }

    public boolean isElectricIsolated() {
        return electricIsolated;
    }

    public void setElectricIsolated(boolean electricIsolated) {
        this.electricIsolated = electricIsolated;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public boolean isOneHand() {
        return oneHand;
    }

    public void setOneHand(boolean oneHand) {
        this.oneHand = oneHand;
    }

    //end getter and setter

}
