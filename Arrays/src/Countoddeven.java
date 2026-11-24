public class Countoddeven
{
    static void main()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println();
        System.out.println("the even elements in the array is :- "+  even);
        System.out.println("the odd elements in the array is :- "+  odd);
    }
}
