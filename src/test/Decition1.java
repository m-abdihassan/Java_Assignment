package test;

import java.util.Scanner;

public class Decition1 {
    Scanner kb=new Scanner(System.in);
    public  Decition1(){
        System.out.println("Enter number: ");
        int n= kb.nextInt();
        System.out.println("1. sqr \n2. Cubic");
        int ch= kb.nextInt();
        switch (ch){
            case 1:
                System.out.println(n==0?"Enter number greathan 0":"sqr is"+(n*n));

                break;
            case 2:
                System.out.println("cubic"+(n*n*n));
                break;
            default:
                System.out.println("macsalaamo");
        }
    }
}
