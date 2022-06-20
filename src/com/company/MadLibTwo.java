package com.company;

import java.util.Scanner;

public class MadLibTwo {
    public static void Play(){
        Scanner scan = new Scanner(System.in);
        // create string array to store the user's input words
        String[] camp = new String[19];
        System.out.println("Enter an adjective: ");
        camp[0] = scan.nextLine();

        System.out.println("Enter a noun: ");
        camp[1] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        camp[2] = scan.nextLine();

        System.out.println("Enter a verb: ");
        camp[3] = scan.nextLine();

        System.out.println("Enter a verb: ");
        camp[4] = scan.nextLine();

        System.out.println("Enter a verb: ");
        camp[5] = scan.nextLine();

        System.out.println("Enter a plural noun: ");
        camp[6] = scan.nextLine();

        System.out.println("Enter a verb: ");
        camp[7] = scan.nextLine();

        System.out.println("Enter a verb-ing: ");
        camp[8] = scan.nextLine();

        System.out.println("Enter a noun: ");
        camp[9] = scan.nextLine();

        System.out.println("Enter a verb: ");
        camp[10] = scan.nextLine();

        System.out.println("Enter an adjective: ");
        camp[11] = scan.nextLine();

        System.out.println("Enter a verb-ing: ");
        camp[12] = scan.nextLine();

        System.out.println("Enter a adjective: ");
        camp[13] = scan.nextLine();

        System.out.println("Enter an noun; place: ");
        camp[14] = scan.nextLine();

        System.out.println("Enter an noun; animals: ");
        camp[15] = scan.nextLine();

        System.out.println("Enter an noun; animals: ");
        camp[16] = scan.nextLine();

        System.out.println("Enter a verb-ing: ");
        camp[17] = scan.nextLine();

        System.out.println("Enter an noun; food: ");
        camp[18] = scan.nextLine();

        System.out.println("");
        // print out story and insert array values
        System.out.print("My family and I are going camping near a " + camp[0] + " " + camp[1]+ "\n"
                + "this summer. Camping is " + camp[2] + " because you get to " + camp[3]
                + "\nand " + camp[4] + " outside. When we " + camp[5]
                + "\nto the campground, we set up our \n"+  camp[6]
                + " where we will " + camp[7] + " at night."
                + "\nWe like to go " + camp[8] + " in the " + camp[9]
                + ", hoping to " + camp[10] + " some"
                + "\n" + camp[11] + " fish for dinner. We also go "
                + camp[12] +" in the " + camp[13] + ", hoping to\n"
                + " spot wildlife like" + camp[14] + " or " + camp[15]
                + ". My favorite part about camping is " + camp[16]
                + "\n" + camp[17] + " over the campfire.\n\n\n");
        // call playAgain to give user the option to play again
        Main.playAgain();
    }
}
