public class secondminimunvalue
{
    static void main()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < smin && arr[i] != min) smin = arr[i];
        }
        System.out.println(min);
        System.out.println(smin);
    }

}
