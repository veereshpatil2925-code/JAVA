// Sum of even numbers
import java.util.Scanner;

public class sumeven
{
    static void main(String[] args)
    {
        {
            Scanner Sc = new Scanner(System.in);
            int n;
            n = Sc.nextInt();
            for(int i = 1 ; i<=n ; i++)
            {
                if (i == 4) continue;
                System.out.println(i);
            }
        }
    }
}
