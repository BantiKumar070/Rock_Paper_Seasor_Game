package com.company;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Seasor_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's Play the Game");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Seasor");

        int computer_choice;
        int computer_won = 0;
        int my_choice;
        int me = 0;
        int game = 1;

        while (game<=5)
        {
            Random q = new Random();
            computer_choice = q.nextInt(2);
            my_choice = sc.nextInt();

            switch (my_choice)
            {
                case 0:
                    System.out.println("you choose 'Rock' ");
                    break;
                case 1:
                    System.out.println("you choose 'Paper' ");
                    break;
                case 2:
                    System.out.println("you choose 'Seasor' ");
                    break;
            }
            switch (computer_choice)
            {
                case 0:
                    System.out.println("Computer choose 'Rock' ");
                    break;
                case 1:
                    System.out.println("Computer choose 'Paper' ");
                    break;
                case 2:
                    System.out.println("Computer choose 'Seasor' ");
                    break;
            }

            if (my_choice == computer_choice) {
                System.out.println("Match tie !!");
            } else if (computer_choice == 0 && my_choice == 1) {
                System.out.println("I won😍 !! And Computer loss😒");
                me++;
            } else if (computer_choice == 0 && my_choice == 2) {
                System.out.println("Computer Won😍 ");
                computer_won++;
            } else if (computer_choice == 1 && my_choice == 0) {
                System.out.println("Computer Won!!😍");
                computer_won++;
            } else if (computer_choice == 1 && my_choice == 2) {
                System.out.println("I won !!😍");
                me++;
            } else if (computer_choice == 2 && my_choice == 0) {
                System.out.println("I won!!😍");
                me++;
            } else if (computer_choice == 2 && my_choice == 1) {
                System.out.println("Computer Won!!😍");
                computer_won++;
            }
            if (game == 5) {
                break;
            }
            game++;
        }

        System.out.println(".......................................");
        System.out.println("computer "+": "+computer_won);
        System.out.println("me "+": "+me);

        if (computer_won > me) {
            System.out.println("Hurrah Computer Won the Game");
        }
        if (computer_won == me){
            System.out.println("Match tie!!😒😒");
        }
        else {
            System.out.println("I won the Game 😍😁😂😘 ");
        }
    }
}
