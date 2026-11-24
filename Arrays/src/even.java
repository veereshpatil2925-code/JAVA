import java.util.Scanner;

public class even
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of index :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the number of elements in array:- ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i]);
        }

    }
}


