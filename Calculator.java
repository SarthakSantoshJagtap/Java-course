package myfirstproject.ApnaCollage;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second Number ");
        double num2 = sc.nextDouble();
        System.out.println("Choice the operator + , -, *,or / ");
        char operation = sc.next().charAt(0);

        double result;
        switch (operation) {

            case '+':
            result = num1+num2;
            System.out.println("result :"+result);                
                break;

            case'-':
            result= num1-num2;
            System.out.println("result: "+result);
            break;

            case '*':
            result= num1*num2;
            System.out.println("result :"+result);                
                break;
            case'/':
            result=num1/num2;
            System.out.println(+result);
            
                if (num2 !=0)
              
                 {
                   
                    System.out.println("result:"+result);
                    
                }
                else
                {
                    System.out.println("can not divide by zero");
                }
                break;
        
            default:
            System.out.println("invalid operator");
            
        }

    }
}
