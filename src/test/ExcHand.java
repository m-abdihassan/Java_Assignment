package test;

import java.util.Scanner;

public class ExcHand {
    Scanner kb = new Scanner(System.in);

    public ExcHand() {
        boolean bol = true;
        do {


            try {
                System.out.println("Enter number : ");
                int n = kb.nextInt();
                System.out.println("The number is: " + n);
                bol = false;
            } catch (Exception ex) {
                System.out.println("fadlan gali number kali");
                kb.next();

            }

        }while (bol);



    }
}