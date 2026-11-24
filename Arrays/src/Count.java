import java.util.Scanner;

public class Count
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // taking in index as input
        int n , count = 0;
        System.out.println("Enter the number of index :-");
        n = sc.nextInt();
        int [] arr = new int[n];
        // taking array elements as input
        System.out.println("Enter the number of elements in array:- ");
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // printing an array
        for(int i = 0 ; i<arr.length;i++){
            count += arr[i];
        }
        System.out.println(count);

    }
}
