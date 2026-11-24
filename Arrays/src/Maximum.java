import java.util.Scanner;

public class Maximum
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of index in array:- ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("enter the number of elements in array :- ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            if(arr[i]< min) min = arr[i];

        }
        System.out.println(max);
        System.out.println(min);
    }
}
