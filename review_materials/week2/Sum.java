public class Sum
{
    public static void main(String[] args)
    {
        int sum = 0;

        for (int i = 1; i <= 100; ++i)
        {
            sum = sum + i;
        }

        System.out.println(sum);

        for (int i = 1; i <= 200; ++i)
        {
            sum = sum + i;
        }

        System.out.println(sum);


    }
}
