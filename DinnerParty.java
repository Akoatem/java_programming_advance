public class DinnerParty extends Party{
    private double dinnerChoiceFees = 0.0;
    private String dinnerChoice = "";

    public DinnerParty(int numberOfGuests,double costPerHead,String address,String dinnerChoice){
        super(numberOfGuests, costPerHead, address);
        this.dinnerChoice = dinnerChoice;
    }

    public void DinnerChoiceFees(){
        if(dinnerChoice.equalsIgnoreCase("Buffet")) {
            this.dinnerChoiceFees = 0.0;
        }
        else if(dinnerChoice.equalsIgnoreCase("Spit Braii")){
            this.dinnerChoiceFees = 150;
        }
        else {
            this.dinnerChoiceFees = 300;

        }

    }
    public String getDinnerChoice(){
        return dinnerChoice;
    }

    @Override
    public double calculateCost() {
        return 0;
    }

    @Override
    public String displayInvitation() {
        return null;
    }

    @Override
    public String toString(){
        return "DinnerParty{"+" number of guess=" +numberOfGuests + " Cost Per Head=" +costPerHead + " Address=" +address +" Dinner choice=" +dinnerChoice +'}';
    }
}
