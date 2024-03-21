
import java.util.Scanner;

class Passenger {
    private String name;
    private int age;
    private char gender;
    int NumOfPass = 0;

    Scanner sc1 = new Scanner(System.in);

    public void input() {
        System.out.println("-------------Enter the passenger details------------\n");
        System.out.println("Enter the passenger Name: ");
        name = sc1.nextLine();
        System.out.println("Enter the Age: ");
        age = sc1.nextInt();
        System.out.println("Enter the Gender (M or F): ");
        gender = sc1.next().charAt(0);
        NumOfPass = NumOfPass + 1; // NumOfPass++;
    }

    public void output() {
        System.out.println("-Passenger details-");
        System.out.println("\t\t\tNo of passengers = " + NumOfPass);
        System.out.println("\t\t\tPassenger name = " + name);
        System.out.println("\t\t\tAge = " + age);
        System.out.println("\t\t\tGender = " + gender);
    }
}

class Flight {
    private String flightName;
    private int flightNo;
    private String flightClass;
    private String section;
    private String date;
    private int go;
    private int land;

    public void in() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\nEnter the Airplane name (boing_109, L32ng4): ");
        flightName = sc2.nextLine();
        System.out.println("Enter plane no: ");
        flightNo = sc2.nextInt();
        sc2.nextLine(); // Consume newline character
        System.out.println("Enter class (High, middle, low): ");
        flightClass = sc2.nextLine();
        System.out.println("Enter section (A, B, C, D): ");
        section = sc2.nextLine();
        System.out.println("Enter date: ");
        date = sc2.nextLine();

        System.out.println("\nPlace for going:");
        System.out.println("1: New Delhi\n2: Patna\n3: Mumbai\n4: Bangalore\n5: Punjab\n6: Haryana");
        System.out.println("Enter your choice: ");
        go = sc2.nextInt();
        printPlace(go);

        System.out.println("\nPlace for landing:");
        System.out.println("1: New Delhi\n2: Patna\n3: Mumbai\n4: Bangalore\n5: Punjab\n6: Haryana");
        System.out.println("Enter your choice: ");
        land = sc2.nextInt();
        printPlace(land);
        sc2.close();
    }

    private void printPlace(int choice) {
        switch (choice) {
            case 1:
                System.out.print("--New Delhi");
                break;
            case 2:
                System.out.print("--Patna");
                break;
            case 3:
                System.out.print("--Mumbai");
                break;
            case 4:
                System.out.print("--Bangalore");
                break;
            case 5:
                System.out.print("--Punjab");
                break;
            case 6:
                System.out.print("--Haryana");
                break;
            default:
                System.out.print("--Invalid choice");
                break;
        }
    }

    public void out() {
        System.out.println("\n\t\t\tFlight name = " + flightName);
        System.out.println("\t\t\tFlight no = " + flightNo);
        System.out.println("\t\t\tClass = " + flightClass);
        System.out.println("\t\t\tSection = " + section);
        System.out.println("\t\t\tDate = " + date);
        System.out.println("\t\t\tGoing from = " + go);
        System.out.println("\t\t\tLanding To = " + land);
    }
}

class Ticket extends Passenger {
    private static final int BASE_RATE = 5000; // Base rate per passenger
    private int totalRate; // Total rate for all passengers

    public void set() {
        // Calculate total rate based on number of passengers
        totalRate = BASE_RATE * NumOfPass;
        System.out.println("Rate per passenger = " + BASE_RATE);
        System.out.println("Total rate for " + NumOfPass + " passengers = " + totalRate);
    }

    public void get() {
        System.out.println("\n\t\t\tTotal rate = " + totalRate);
        System.out.println("\n\n");
    }
}

public class AirlineSystem extends Flight {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        int familyNo;

        System.out.println("======================================================");
        System.out.println("*	      Horizon Wings Airline                  *");
        System.out.println("======================================================");

        System.out.println(" Hello Dear, THE 'HORIZON WINGS' PROVIDES YOU BEST SERVICES");
        System.out.println(" How Many seats are avalibel for Booking  Horizon Wings : ");
        familyNo = sc3.nextInt();

        if (familyNo > 0) {
            Ticket[] tickets = new Ticket[familyNo];
            for (int i = 0; i < familyNo; i++) {
                tickets[i] = new Ticket();
                tickets[i].input();
                tickets[i].set();
            }

            System.out.println("-----------Your Details-----------");
            for (int i = 0; i < familyNo; i++) {
                tickets[i].output();
                Flight flight = new Flight();
                flight.in();
                flight.out();
                tickets[i].get();
            }
        } else {
            System.out.println("\nInvalid choice. Please enter a valid choice.");
        }
        System.out.println("=============Thanks you visit again ==================");

        System.out.println("======================================================");
        sc3.close();
    }
}
