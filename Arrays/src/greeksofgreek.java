public class greeksofgreek
{
    static void main(String[] args)
    {
        int[] arr = {10,1,2,8,4,5,8,7,6};
        int x = 9;
        int min = Integer.MAX_VALUE;
        int count = 0 , n = arr.length;
       for(int i = 0 ; i<n ; i++)
       {
           if(arr[i]< x)
           {
               System.out.print(arr[i]+" ");
               count++;
           }
       }
        System.out.println();
        System.out.println(count);
    }
}
