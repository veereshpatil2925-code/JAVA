import java.util.Arrays;
public class shallowcopyanddeepcopy
{
    static void main(String[] args)
    {
        int[] arr = { 1, 2 , 4, 5, 7};
        int[] x = arr; // Shallow copy of an array
        int[]  y = Arrays.copyOf(arr , arr.length);//deep copy
        System.out.println(arr[0]);
        System.out.println(y[0]);
    }
}
