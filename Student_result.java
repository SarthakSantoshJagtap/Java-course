package myfirstproject.ApnaCollage;
import java.util.*;
public class Student_result {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int marks  = sc.nextInt();
        
        if (marks<=100 && marks>=90) {
            System.out.println(marks+":this is Good ");
            
        }

        else if (89 >= marks && marks >= 60) {
            System.out.println(marks+":this is also Good ");
            
        }
        else if (59 >= marks && marks >= 0) {
            System.out.println(marks+":this is Good  as well ");
           
        } else

        {
        System.out.println(marks+"invalid");
    }
    }
            

}
