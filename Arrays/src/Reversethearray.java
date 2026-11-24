public class Reversethearray
{
    static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int i = 0 , j = arr.length-1;
        while(i<j)
        {
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele +" ");
    }
}
