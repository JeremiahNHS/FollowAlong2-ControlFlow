package part06;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        /* MY GUESS:
        C or better
        Easy
        (i thought every line of code would execute without a break but its only every line after we get a match)
        Medium
        Hard
         */
        int score = 85;
        if (score >= 70) {
            System.out.println("C or better");
        } else if (score >= 80) {
            System.out.println("B or better");
        } else {
            System.out.println("Below C");
        }

        int level = 2;
        switch (level) {
            case 1:
                System.out.println("Easy");
            case 2:
                System.out.println("Medium");
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown");
        }

        //B1
        int temp = 40;

        if (temp >= 80) {
            System.out.println("Shorts weather");
        } else if (temp >= 60) {
            System.out.println("Hoodie weather");
        } else {
            System.out.println("Coat weather");

        }

        //B2
        int month = 1;

        switch(month){
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("That is not a month");
        }

        //B3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter batter percentage:");
        int percent = scanner.nextInt();

        if (percent < 20){
            System.out.println("Low battery. Go Charge!");
        } else if (percent < 80){
            System.out.println("Battery OK");
        } else {
            System.out.println("Fully charged");
        }

    }

}
