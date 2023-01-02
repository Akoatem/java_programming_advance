
/*
        * PartyMenu.java
        * write a program that print party menu and choices of dishes for three different groups of classes
        */

import java.util.Scanner;

public class RunParty {
   public static char choice;

   public static void main(String args []){
       Scanner sc = new Scanner(System.in);

       int choice = 0;

       Party[] p = new Party[10];
       p[0] = new DinnerParty(21, 60.00, "32 Fisher street Cape Town", " buffet");

       p[1] = new DinnerParty(11, 55.00, "102 wale street Cape Town", " Rice");

       p[2] = new DinnerParty(40, 105.00, "211 Strand street Goodwood", " Beans");

       p[3] = new DinnerParty(12, 100.00, "44 Roth street Parow", " Pap");

       p[4] = new DinnerParty(49, 40.00, "33 Spencer street Cape Town", " Eru");

       int size = 1;


       boolean PartyMenu = true;

       while (PartyMenu) {
           System.out.println(menu());
           choice = Integer.parseInt(sc.next());
           switch (choice) {
               case 1:
                   size = addParty(p, size);
                   break;
               case 2:
                   changeDinnerCostPerHead(p, size);
                   break;
               case 3:
                   displayInvites(p, size);
                   break;
               case 4:
                   showParty(p, size);
                   break;
               case 5:
                   System.exit(0);
           }
       }
   }

    public static String menu() {
        return "1) Add party \n"
                + "2) Change cost per head \n"
                + "3) Display invitations \n"
                + "4) Show party \n"
                + "5) Exit \n";

    }


    public static int addParty(Party [] p , int size) {
        System.out.println("Kids party or Dinner party?");

        Scanner sc = new Scanner(System.in);
        String partyType = sc.nextLine();

        if(partyType.equalsIgnoreCase("Dinner Party")){

            System.out.println("Enter address ");
            String address = sc.next();

            System.out.println("Enter dinner choice ");
            String dinnerChoice = sc.next();

            System.out.println("Enter cost per head");
            double costPerHead = sc.nextDouble();

            System.out.println("Enter number of guests");
            int numberOfGuests = sc.nextInt();
            //Party [] p = new DinnerParty[5];
            p[0] = new DinnerParty(11,22,"12 Wale Street,dinnerChoice","Beans");
            p[1] = new DinnerParty(32,12,"44 Wale Street,dinnerChoice","Rice");
            p[2] = new DinnerParty(42,98,"54 Wale Street,dinnerChoice","fufu");
            p[3] = new DinnerParty(89,65,"76 Wale Street,dinnerChoice","Pap");
            p[4] = new DinnerParty(76,82,"23 Wale Street,dinnerChoice","Ndole");

            System.out.println(p[1].toString());
            size++;
            return size;

        }
        else {
            System.out.println("Enter address ");
            String address = sc.nextLine();

            System.out.println("Enter cost per head");
            double costPerHead = sc.nextDouble();

            System.out.println("Enter number of guests");
            int numberOfGuests = sc.nextInt();

            System.out.println("Enter theme");
            String theme = sc.next();

            System.out.println("Enter supervisor");
            String supervisor = sc.next();

            //p[size] = new KidsParty();
            p[0] = new KidsParty(12,112.0,"104 Cole street cape town","Jolie","Suh");
            p[1] = new KidsParty(34,2012.0,"134 Neet street cape town","Ako","Willy");
            p[2] = new KidsParty(22,202.0,"104 Neet street cape town","JMake","John");
            p[3] = new KidsParty(11,2112.0,"1044 Neet street cape town","Jolie","Shelye");
            p[4] = new KidsParty(44,2120.0,"204 Neet street cape town","Jolie","Sam");

            System.out.println(p[1].toString());

            size++;

            return size;
        }
    }




    public static void showParty(Party []p, int size){
        for(int i = 0; i < size; i++){
            System.out.println(p[i].toString());
            System.out.println();
        }
    }

    public static void displayInvites(Party [] p, int size){
        for(int i = 0; i < size; i++){
            System.out.println(p[i].displayInvitation());
            System.out.println();
        }
    }

    public static void changeDinnerCostPerHead(Party [] p , int size) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dinner choice  Buffet , Spit-Braai , Sit-down");
        String choice = sc.next();

        System.out.println("Enter price to increase ");
        double increase = sc.nextDouble();

        for (int i = 0 ; i < size ; i++) {
            if(p[i] instanceof DinnerParty){
                if(((DinnerParty)p[i]).getDinnerChoice().equalsIgnoreCase(choice)){
                    p[i].costPerHead += increase;
                }
            }

        }

    }

}


