package myfirstproject.ApnaCollage;

import java.lang.runtime.SwitchBootstraps;
import java.util.*;
public class Calu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the First number ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number ");
        double num2 = sc.nextDouble();
        System.out.println("Choose the operation  +,-,/,OR *");
        char operation = sc.next().charAt(0);

        double result;
         switch(operation)
         {
            case '+': 
            result= num1+num2;
            System.out.println("Result :"+result);
            break;
            case '-':
            result = num1-num2;
            System.out.println("reslut :"+result);
            break;
            case '*':
            result= num1*num2;
            System.out.println("Result :"+result);
            break;
            case '/':
            result = num1/num2;

            if (num2 != 0) {
                System.out.println("result: "+result);
            }
            else
            {
                System.out.println("can not divide by 0");
            }
            break;
            default:
            System.out.println("invlaid operation ");

         }


    }
}
