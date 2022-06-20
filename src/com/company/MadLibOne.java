package com.company;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MadLibOne {
    public static void Play(){
        Scanner scan = new Scanner(System.in);
        // create string array to store the user's input words
        String[] zoo = new String[12];
        System.out.println("Enter an adjective: ");
        zoo[0] = scan.nextLine();

        System.out.println("Enter a noun: ");
        zoo[1] = scan.nextLine();

        System.out.println("Enter a verb ( past tense ): ");
        zoo[2] = scan.nextLine();

        System.out.println("Enter an adverb: ");
        zoo[3] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        zoo[4] = scan.nextLine();

        System.out.println("Enter an noun: ");
        zoo[5] = scan.nextLine();

        System.out.println("Enter an noun: ");
        zoo[6] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        zoo[7] = scan.nextLine();

        System.out.println("Enter an verb: ");
        zoo[8] = scan.nextLine();

        System.out.println("Enter an adverb: ");
        zoo[9] = scan.nextLine();

        System.out.println("Enter a verb ( past tense ): ");
        zoo[10] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        zoo[11] = scan.nextLine();
        // print out story and insert array values
        System.out.println ("Today I went to the zoo. I saw a " + zoo[0] + " " + zoo[1]+ "\n"
                + "jumping up and down in its tree. He " + zoo[2] + " " + zoo[3]
                + "\nthrough the large tunnel that led to its " + zoo[4] + " " + zoo[5]
                + "\nI got some peanuts and passed them through the cage to a\ngigantic gray "
                + zoo[6] + " towering above my head. Feeding that\nanimal made me "
                + "hungry. I went to get a " + zoo[7] + " scoop of ice cream."
                + "\nIt filled my stomach. Afterwards I had to " + zoo[8] + " " + zoo[9]
                + "\nto catch our bus. When I got home I " + zoo[10] + " my mom for a "
                + "\n" + zoo[11] + " day at the zoo.\n \n");
        // call playAgain to give user the option to play again
        Main.playAgain();
    }
}

