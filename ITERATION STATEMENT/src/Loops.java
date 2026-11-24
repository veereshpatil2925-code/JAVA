import java.util.Scanner;

public class Loops
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number :- ");
        n = sc.nextInt();
        for(int i = 1; i <= n;i++){
            if(i%2==0) System.out.println(i);
        }

    }
}