package Methods_java;

public class Simpleprograam
{
    public static void loop()
    {
        int n = 6;
        for(int row = 1;row<=n;row++)
        {
            for(int col = 1; col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args)
    {
        System.out.println("Veeresh patil");
        loop();
    }
}
