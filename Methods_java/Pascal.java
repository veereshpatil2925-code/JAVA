package Methods_java;

import java.util.Scanner;

public class Pascal
{
    public static int fact(int x)
    {
        int fact = 1;
        for(int i = 1 ; i<=x;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- " );
        int n = sc.nextInt();
        for(int row = 1 ; row<=n; row++)
        {
            for(int col = 1; col<=n-row;col++)
            {
                System.out.print(" "+" ");
            }
            for(int col = 1 ; col<=row;col++)
            {
                int icj = fact(row - 1)/(fact(col - 1)*fact(row - col));
                System.out.print(icj +" "+" "+" ");
            }
            System.out.println();
        }
    }
}