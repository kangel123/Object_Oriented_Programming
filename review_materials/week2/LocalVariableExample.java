public class LocalVariableExample
{
    public static void main(String[] args)
    {
        int a = 3;

        if (a == 3)
        {
            System.out.println("a = " + a);

            int b = 5;
            System.out.println("b = " + b);
            b=3;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
