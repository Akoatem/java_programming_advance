public abstract class Party {
    protected int numberOfGuests = 0;
    protected double costPerHead = 0.0;
    protected String address ="";

    public Party(int numberOfGuests,double costPerHead,String address){
        this.numberOfGuests = numberOfGuests;
        this.costPerHead = costPerHead;
        this.address = address;

    }

    public  abstract double calculateCost();


    public abstract String displayInvitation();

    @Override
    public String toString(){
        return "Party{"+" number of guest=" +numberOfGuests + " cost per head=" +costPerHead + " Address=" +address +'}';
    }
}


