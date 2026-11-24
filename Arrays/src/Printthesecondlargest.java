public class Printthesecondlargest
{
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int second = 0;
        for(int i = 0;i< arr.length;i++)
        {
            if(min << arr[i] < max)
                second = arr[i];
        }
        System.out.println(second);
    }
}
