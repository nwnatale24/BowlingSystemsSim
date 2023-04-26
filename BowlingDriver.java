// 4/26/23
//
// Systems Simulation and Modeling - Fall 2023
//
// Nicholas Natale
// Daniel Ortiz
// Nikolas Vasiliadis
// Luck Heck

import java.util.Scanner;


public class BowlingDriver {
    public static void main(String []args) {

        System.out.println("Enter Number of Bowling Games to Simulate: ");
        Scanner scanner = new Scanner(System.in);

        String numGames = scanner.nextLine();
        scanner.close(); 
        System.out.println("Number of Games Entered: " + numGames);


        //BowlingSim bowlingSim = new BowlingSim();
        //System.out.println(bowlingSim.test);


    }
}
