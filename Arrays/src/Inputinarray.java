import java.util.Scanner;

public class Inputinarray
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8];
        // input in  arrays
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        // for printing the array in the output page
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]<0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
