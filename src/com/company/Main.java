package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Print welcome message
        System.out.println("Hello. Welcome to Mad Libs!");
        //Call method that runs the game
        Main.app();
    }
    public static void app(){
        //create scanner to collect user input
        Scanner scan = new Scanner(System.in);
        //prompt user to choose a story
        System.out.println("Which story would you like to use? Please enter the corresponding letter.");
        System.out.println("a. A Day at the Zoo\nb. Camping \nc. A Day at the Park");
        String answer = scan.nextLine();
        //if they enter a blank space it will prompt them again
        if(answer.length()<1){
            Main.app();
        }
        // if they select a it will run the first mad lib
        if((answer.charAt(0) == 'a')|| (answer.charAt(0) == 'A')){
            MadLibOne.Play();
        }
        // if they select b it will run the second mad lib
        if((answer.charAt(0) == 'b')|| (answer.charAt(0) == 'B')){
            MadLibTwo.Play();
        }
        // if they select c it will run the third mad lib
        if((answer.charAt(0) == 'c')|| (answer.charAt(0) == 'C')){
            MadLibThree.Play();
        }
        // if they enter something other it will clairfy
        else System.out.println("Please enter the letter a, b, or c.");

    }

    public static void playAgain() {
        // lets user play again
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again?\na. yes\nb. no");
        String response = scan.nextLine();
        // if people enter a blank space it will prompt them again
        if (response.length() < 1) {
            System.out.println("Please enter the letter a or b.");
        }
        // if they choose a it will restart the game
        if ((response.charAt(0) == 'a') || (response.charAt(0) == 'A')) {
            Main.app();
        }
        // if they choose b it will stop running
        if ((response.charAt(0) == 'b') || (response.charAt(0) == 'B')) {
            System.out.println("Okay thanks for playing. goodbye.");
            System.exit(0);
        }
        else System.exit(0);;
    }
    }
