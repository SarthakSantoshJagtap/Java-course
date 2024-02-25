package myfirstproject.ApnaCollage;

public class Inverted_half_pyamid_with_num {
    public static void main(String[] args) {
        int n=5 ;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}
