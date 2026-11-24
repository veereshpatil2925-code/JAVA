// Write a method to calculate the factorial of a number.
package Methods_java;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Factorail
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

    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("the factorial of the number is :- "+fact(x));
    }
}
