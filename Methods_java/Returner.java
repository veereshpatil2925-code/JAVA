package Methods_java;

import java.util.Scanner;

public class Returner
{
    public static boolean Iseven(int x)
    {
        if(x%2!=0)
        {
            return false;
        }
        return true;
    }
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((Iseven(x)));

    }
}
