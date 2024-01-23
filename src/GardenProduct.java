
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class GardenProduct  {

    private boolean itsPoison;//Check if the product is poison or not
    private String gardenId;//The id of the product
    //constructor

    public GardenProduct(boolean itsPoison, String gardenId) {
        this.itsPoison = itsPoison;
        this.gardenId = gardenId;
    }

    //End constructor

    //getter and setter

    public boolean isItsPoison() {
        return itsPoison;
    }

    public void setItsPoison(boolean itsPoison) {
        this.itsPoison = itsPoison;
    }

    public String getGardenId() {
        return gardenId;
    }

    public void setGardenId(String gardenId) {
        this.gardenId = gardenId;
    }

    //end getter and setter



}
