import java.util.Scanner;

public class Count
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=n ; i++)
        {
            System.out.print(i+" ");
            count+=i;
        }
        
        System.out.println("The sum of the digit is:- "+count);

    }

}