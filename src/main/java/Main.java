import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean input = true;
        RidesRecord ridesRecord = new RidesRecord();
        List<Integer> rides = ridesRecord.getRides();
        do {
            System.out.println("Choose an option");
            System.out.println("1. Enter ride detail");
            System.out.println("2. Get aggregate fare");
            System.out.println("3. Generate invoice");
            System.out.println("0. EXIT");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Input distance");
                    int distance = sc.nextInt();
                    System.out.println("Input wait time");
                    int waitTime = sc.nextInt();
                    try {
                        CabRide ride = new CabRide(distance, waitTime);
                        rides.add(ride.getRideFare());
                    }
                    catch (Exception e){
                        System.out.println("ERROR: Invalid distance/wait time entered");
                    }
                    break;

                case 2:
                    int aggregateFare = 0;
                    for(Integer fare : rides){
                        aggregateFare += fare;
                    }
                    System.out.println("Your aggregate fare is: "+ aggregateFare);
                    break;

                case 3:
                    int noOfRides = rides.size();
                    int totalFare = 0;
                    for(Integer fare : rides){
                        totalFare += fare;
                    }
                    System.out.println("INVOICE");
                    System.out.println("Total number of rides : "+ noOfRides);
                    System.out.println("Total fare : "+ totalFare);
                    try {
                        System.out.println("Average fare : " + totalFare/noOfRides);
                    }
                    catch (ArithmeticException e){
                        System.out.println("ERROR: "+ e.getMessage());
                    }
            }
        }
        while (input);
    }
}
