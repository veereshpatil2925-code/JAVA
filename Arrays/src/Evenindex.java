public class Evenindex
{
    static void main()
    {
        int[] arr = {1,2,3,4,6,7,8,9};
//        int even = 2;
//        int odd = 10;
        for(int i = 0 ; i< arr.length;i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(arr[i]*2+" ");
            }
            else System.out.print(arr[i]+10+" ");

        }
    }
}
