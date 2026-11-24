//Write a method to find the largest of three numbers.
package Methods_java;

public class Greatestofthree
{
    public static int three(int x , int y , int z)
    {
        if(x>y && x>z)
        {
            return x;
        } else if (y>x && y>z)
        {
       return y;
        }
        else System.out.println(z + " is the greatest");
        return z;
    }

    static void main(String[] args) {
        int x = 8;
        int y = 9;
        int z = 6;
        System.out.println( "The greatest among three is :- "+(three( x,y,z)));
    }
}
