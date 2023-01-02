public class KidsParty extends Party{

    private String theme = "";
    private String supervisor = "";

    public KidsParty(int numberOfGuests, double costPerHead, String address, String theme, String supervisor) {
        super(numberOfGuests, costPerHead, address);
        this.theme = theme;
        this.supervisor = supervisor;
    }

    public String toString() {
        return "KidParty{" + " number of guess=" + numberOfGuests + " Cost Per Head=" + costPerHead + " Address=" + address + " Theme=" + theme + " Supervisor=" + supervisor + '}';
    }

    public double calculateCost() {
        return costPerHead * numberOfGuests + 200.00;
    }

    @Override
    public String displayInvitation() {
        return " Please come to my Kids Party at "+  address +"\n" + " Dress theme is "+ theme+"\n" + " Supervisor is "+ supervisor;
    }
}
