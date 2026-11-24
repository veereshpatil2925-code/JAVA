package Methods_java;

public class Scopevariable
{
    static int i = 29; // Global declaration

    static void main(String[] args)
    {
        System.out.println(i);
        int i = 6; // local declaration ; it has highest priority
        System.out.println(i);
        fun();
    }
    public static void fun()
    {
        System.out.println(i);
        int i = 90;
        System.out.println(i);
    }
}
