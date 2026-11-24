//Reverse digits of a number (e.g., 12345 → 54321)
import java.util.Scanner;

public class REv
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
         int n, rev=0;
         n = sc.nextInt();
         int i ;
         while(n!=0)
         {
             int digit = n%10;
             rev = rev * 10 + digit ;
             n/=10;
         }
        System.out.println(rev);
    }
}
