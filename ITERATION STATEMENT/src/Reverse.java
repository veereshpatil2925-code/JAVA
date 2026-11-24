import java.util.Scanner;

public class Reverse
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rev = 0;
         while(x!=0)
         {
           int digit =  x%10;
           rev = rev * 10 + digit;
           x/=10;
         }
        System.out.println("the reverse number is :- "+rev);
    }
}
