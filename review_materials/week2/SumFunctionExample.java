public class SumFunctionExample
{
    public static int total(int n)
    {
        int sum = (int)(0.5 * n * (n + 1));

        return sum;
    }
    
    public static void main(String[] args)
    {
        System.out.println(total(100));
        System.out.println(total(200));
        System.out.println(total(10000));
    }
}
