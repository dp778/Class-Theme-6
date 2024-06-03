package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

	    int[] TOTO = new int[6];
	    int[] myNumbers = new int[6];

        int randomNumber;
        int userInput;

        int matches = 0;



        for (int i = 0; i < TOTO.length; i++) {
            do{
                randomNumber = random.nextInt(49) + 1;
            }while(checkUnique(TOTO,randomNumber));
            TOTO[i] = randomNumber;
        }


        System.out.println("Enter 6 unique number in range 1 - 49 included");
        for (int i = 0; i < myNumbers.length; i++) {

            do{
                System.out.printf("Enter number %d : ", i + 1);
                userInput = input.nextInt();
            }while(checkUnique(myNumbers, userInput) || userInput < 1 || userInput > 49);
            myNumbers[i] = userInput;
        }

        for (int myNumber : TOTO) {
            if(checkUnique(myNumbers, myNumber)){
                matches++;
            }
        }

        switch (matches){
            case 0, 1 -> System.out.println("Unlucky tbh :[");
            case 2 -> System.out.println("You have 2 matches");
            case 3 -> System.out.println("You have 3 matches");
            case 4 -> System.out.println("You have 4 matches");
            case 5 -> System.out.println("You have 5 matches");
            case 6 -> System.out.println("You have 6 matches");
        }


    }

    public static boolean checkUnique(int[] TOTO, int number) {
        for (int num : TOTO) {
         if(num == number) return true;
        }
        return false;
    }
}
