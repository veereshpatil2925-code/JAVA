import com.sun.security.jgss.GSSUtil;

public class Differentdatatypesinarray
{
    public static void doublo()
    {
        double[] arr = new double[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void Char(){
        char[] arr = new char[5];
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void st(){
        String[] arr = new String[5];
        for(int i = 0 ; i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    static void main(String[] args) {
        doublo();
        Char();
        st();
    }
}
