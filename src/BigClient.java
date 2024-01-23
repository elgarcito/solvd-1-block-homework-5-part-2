//We only save the data of the big clients
public class BigClient {
    private int bigClientAge;//The amount of time that the client is working with us
    private String regularBuy;//The type of product that the big client buys

    public BigClient(String regularBuy) {
        this.regularBuy = regularBuy;
    }

    //Getters and setters

    public int getBigClientAge() {
        return bigClientAge;
    }

    public void setBigClientAge(int bigClientAge) {
        this.bigClientAge = bigClientAge;
    }

    public String getRegularBuy() {
        return regularBuy;
    }

    public void setRegularBuy(String regularBuy) {
        this.regularBuy = regularBuy;
    }

    //End getter and setters
}
