public class PassingArrayinthemethods
{
    public static void pass(int[] x )
    {
        x[0] = 9;
    }
    static void main(String[] args) {
        int [] arr = { 1 , 2 ,3,4,5,6};
        System.out.println(arr[0]);
        pass(arr);
        System.out.println(arr[0]);
    }
}
