package myfirstproject.ApnaCollage;

public class Inverted_Piryamid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++)   // print the Rows 
        {
            for(int j=1;j<=n-i;j++)     // print the space 
            {
                System.out.print(" ");
            }
            for(int j=1;  j<=i; j++)// print the star
            {
                System.out.print("*");
            }                   
            System.out.println();
        }
    }
}
