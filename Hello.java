// TAKEAWAYS:
// int heltal = 2, 3
// float flyttal = 3.149 --> sufficient for storing 6 to 7 decimal digits
// double flyttal = 3.14929339 --> sufficient for storing 15 decimal digits
// boolean = true or false
// use int only for big numbers
// use byte when possible

import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
    public static void main(String [] args) {

        Scanner myScanner = new Scanner(System.in);

        int secretNumber = 34; // slumpa fram
        int userGuessedNumber = 0;

        while(true) {
            System.out.println("Mata in ett tal:");
            userGuessedNumber = myScanner.nextInt();

            if (userGuessedNumber > secretNumber) {
                System.out.println("Datorns hemliga tal är mindre!");
            } else if (userGuessedNumber < secretNumber) {
                System.out.println("Datorns hemliga tal är större!");
            } else {
                System.out.println("Jaa du hade rätt!");
                break;
            }
        }

        // while(userGuessedNumber != secretNumber) {
        //     System.out.println("Mata in ett tal:");
        //     userGuessedNumber = myScanner.nextInt();

        //     if (userGuessedNumber > secretNumber) {
        //         System.out.println("Datorns hemliga tal är mindre!");
        //     } else if (userGuessedNumber < secretNumber) {
        //         System.out.println("Datorns hemliga tal är större!");
        //     } else {
        //         System.out.println("Jaa du hade rätt!");
        //     }
        // }

        System.out.println("Vad heter du?");
        String namn = myScanner.nextLine();
        System.out.println("Hej kul att du heter " + namn);



        // ARRAYER + LISTOR
        ArrayList<String> myMovies = new ArrayList<>();

        int year = 2023;
        double average = 123.456;

        year = year + 12;
        System.out.println(year);

        average = average + 12.1;
        System.out.println(average);

        System.out.println("Hello");
    }
}