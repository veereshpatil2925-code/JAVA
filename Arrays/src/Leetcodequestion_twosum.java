public class Leetcodequestion_twosum
{
    public static boolean gav(int[] arr)
    {
        int sum = 6;
        for(int i = 0 ; i< arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
            if(arr[i] + arr[j] == sum)
                return true;
            }
        }
        return  false;
    }

    static void main()
    {
    int[] arr = {1,2,4};
        System.out.println(gav(arr));
    }
}
