package com.company;

import java.util.Scanner;

public class MadLibThree {
    public static void Play(){
        Scanner scan = new Scanner(System.in);
        /* create string array to store the user's input words */
        String[] park = new String[19];

        System.out.println("Enter the name of a person: ");
        park[0] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        park[1] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        park[2] = scan.nextLine();

        System.out.println("Enter a noun: ");
        park[3] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        park[4] = scan.nextLine();

        System.out.println("Enter a noun: ");
        park[5] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        park[6] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        park[7] = scan.nextLine();

        System.out.println("Enter a verb: ");
        park[8] = scan.nextLine();

        System.out.println("Enter a verb: ");
        park[9] = scan.nextLine();

        System.out.println("Enter the name of a person: ");
        park[10] = scan.nextLine();

        System.out.println("Enter a verb (past tense): ");
        park[11] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        park[12] = scan.nextLine();

        System.out.println("Enter a verb: ");
        park[13] = scan.nextLine();

        // print out story and insert array values
        System.out.print("Yesterday, " + park[0] + " and I went to the park. One our way \n"
                + "to the " + park[1] +  " park, we saw a " + park[2] + " " + park[3] + " on a bike. \n"
                + "We also saw big " + park[4] + " balloons tied to a " + park[5] + "\n"
                + "Once we got to the " + park[6] + " park, the sky turned " + park[7] +".\n"
                + "It started to " + park[8] + " and " + park[9] + "." + park[10] + " and I \n"
                + park[11] + " all the way home. Tomorrow we will try to go to the \n"
                + park[12] + " park again and hope it doesn't " + park[13] + ".\n\n\n");
        // call playAgain to give user the option to play again
        Main.playAgain();
    }
}
