import java.util.Scanner;

public class sumandaverage
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of index :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        double Average = 0;
        System.out.print("enter the number of elements in array:- ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            Average = sum / arr[i];
        }
        System.out.println("The of the array is :- " + sum);
        System.out.print("The Average of the array is :-"+Average);
    }
}
