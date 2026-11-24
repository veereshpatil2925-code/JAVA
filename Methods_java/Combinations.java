package Methods_java;

import java.util.Scanner;

public class Combinations
{
    public static int fact(int x)
    {
        int fact = 1;
        for(int i = 1; i<=x; i++)
        {
            fact*=i;
        }
        return fact;
    }

  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r) * fact(n-r));
        int pcr = fact(n)/fact(n - r);
        System.out.println(pcr);
    }
}
