import java.util.Scanner;

public class Minimunvalue
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // taking number of index input
        System.out.print("enter the value of index :- ");
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        // taking input of elements in array
        System.out.println("enter the elements of the array :- ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        // printing the array elements
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min) min = arr[i];
        }
        System.out.print(min);
    }
}
