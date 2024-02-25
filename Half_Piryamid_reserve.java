package myfirstproject.ApnaCollage;

public class Half_Piryamid_reserve {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
