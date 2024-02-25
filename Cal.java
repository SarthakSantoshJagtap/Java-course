package myfirstproject.ApnaCollage;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();
        switch (month)
        {
            case 1: 
            System.out.println("jan");
            break;
            case 2: 
            System.out.println("feb");
            break;

            case 3:
            System.out.println("march");
            break;

            case 4 :
            System.out.println("April");
            break;

            default:System.out.println("Invalid Month");
        }

    }
}
