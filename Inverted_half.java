package myfirstproject.ApnaCollage;

public class Inverted_half {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)           // rows 
        {
            for(int j=1;j<=n-i;j++)     // space
            {
               System.out.print(" ");

            }
            
            //inner loop
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            }
        }
        
    }
