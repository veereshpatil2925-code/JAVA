import java.util.Scanner;

public class Inputsinarray
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // input for array
        int[] arr = new int[7];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        // printing output in array
        for(int i = 0 ; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
