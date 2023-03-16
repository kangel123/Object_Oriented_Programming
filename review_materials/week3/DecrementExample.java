public class DecrementExample
{
    public static int decrement(int n)
    {
        n = n - 1;

        return n;
    }

    public static void main(String[] args)
    {
        int n = 10;
        
        System.out.println("Before calling decrement(): " + n);

        decrement(n);

        System.out.println("After calling decrement(): " + n);
    }
}
