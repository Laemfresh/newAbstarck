import java.util.Arrays;

public class Farm1 {
    private String address;
    private Cow[] cows;
    private Sheep[]sheep;
    private Hourse[]hourses;
    private String ownerName;
    public Farm1(){

    }
    public Farm1(String address, Cow[] cows, Sheep[] sheep, Hourse[] hourses, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.hourses = hourses;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cow2) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = this.sheep;
    }

    public Hourse[] getHourses() {
        return hourses;
    }

    public void setHourses(Hourse[] hourse2) {
        this.hourses = hourses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm1 " +
                "\n address='" + address +
                "\n cows=" + Arrays.toString(cows) +
                "\n sheep=" + Arrays.toString(sheep) +
                "\n hourses=" + Arrays.toString(hourses) +
                "\n ownerName='" + ownerName  ;
    }
}
