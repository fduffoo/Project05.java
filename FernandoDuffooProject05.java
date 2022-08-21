/**
 * Name   : Fernando Duffoo
 * Course : CSC1231
 * Project: 05
 * Date   : 6/26/2022
 */

import java.util.*;
import java.util.Scanner;

public class FernandoDuffooProject05
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle to borrow: $");
        double p = sc.nextDouble();
        System.out.print("Enter the interest rate in decimal: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the term (in years): ");
        int term = sc.nextInt();
        int n = term * 12;
        double r = rate / 12;
        
        System.out.println("Month-----Payment-----Total Interest-----Balance");
    
// *** do-while loop ***
        int i = 1;
        do
        {
            double c = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n)- 1);
            double b = Math.pow(1 + r, i) * p - ((Math.pow(1 + r, i)- 1) * c/r);
            double interest = c * i - (p - b);
            System.out.printf("%d $ \t%5.2f \t$ %5.2f \t$ %5.2f\n" , i, c, interest, b);
            i++;
        }
        while (i <= n);
    }
}

// *** while loop ***         
//        int i=1;
//        while (i <= n)
//        {
//            double c = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n)- 1);
//            double b = Math.pow(1 + r, i) * p - ((Math.pow(1 + r, i)- 1) * c/r);
//            double interest = c * i - (p - b);
//            System.out.printf("%d $ \t%5.2f \t$ %5.2f \t$ %5.2f\n" , i, c, interest, b);
//            i++;
//        }
//    }
//}        
        
// *** for loop ***
//        for(int i=1; i<=n; i++)
//        {
//            double c = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n)-1);
//            double b = Math.pow(1 + r, i) * p - ((Math.pow(1 + r, i)-1) * c/r);
//            double interest = c * i - (p - b);
//            System.out.printf("%d $ \t%5.2f \t$ %5.2f \t$ %5.2f\n" , i, c, interest, b);
//        }
//    }
//    
//}

