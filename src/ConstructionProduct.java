public class ConstructionProduct  {


    private double fraction;//How you divide it, for example price per 1 kg, 10 kg, etc
    private boolean needLicense;// If you need a license to buy this product, for example, gasoline.
    private int licenceNumberLength;// if you need a license the amount of numbers in it


    //Constructor

    public ConstructionProduct(double fraction, boolean needLicense, int licenceNumberLength) {
        this.fraction = fraction;
        this.needLicense = needLicense;
    }

    //End constructor

    //Getter and setter

    public double getFraction() {
        return fraction;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }

    public boolean isNeedLicense() {
        return needLicense;
    }

    public void setNeedLicense(boolean needLicense) {
        this.needLicense = needLicense;
    }

    public int getLicenceNumberLength() {
        return licenceNumberLength;
    }

    public void setLicenceNumberLength(int licenceNumberLength) {
        this.licenceNumberLength = licenceNumberLength;
    }
    //end getter and setter

}
