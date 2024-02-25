package myfirstproject.ApnaCollage;
import java.util.*;
public class Sw {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        switch (button)
        {
        case 1 : System.out.println("Prees the 1 button");
        break;
        case 2 : System.out.println ("Press the  2 button");
        break;
        case 3 : System.out.println("Press the 3 button");
        break;
        default : System.out.println("invalid button");
    }

    }
}
