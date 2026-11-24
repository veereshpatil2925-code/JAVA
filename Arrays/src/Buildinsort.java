import java.util.Arrays;
public class Buildinsort
{
    public static void print(int[]arr){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void main() {
        int[] arr = {5,4,8,75,56,9};
        print(arr);
        Arrays.sort(arr);
      print(arr);
    }
}
