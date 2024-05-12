package test;

import java.util.Scanner;

public class Array1 {
    Scanner kb=new Scanner(System.in);
    int[]tiro;
    public Array1(){
        System.out.println("meeqa tiro: ");
        int n=kb.nextInt();
      tiro=new int[n+1];
        for (int i = 0; i < tiro.length-1; i++) {
            System.out.println("Enter number "+(i+1));
            tiro [i]=kb.nextInt();
            tiro[tiro.length-1]=tiro[tiro.length-1]+tiro[i];
        }



        System.out.println("the sum is "+tiro[tiro.length-1]);
    }
}
