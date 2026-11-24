package Methods_java;

import java.util.Scanner;

public class Passbyvalue
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // and this two are different variable boxes
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        pass(a,b);
    }
    public static void pass(int a , int b) //--------> this are the different variable boxes
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a+" "+b);
    }
}
