public class TypeConversion
{
    public static void main(String[] args)
    {
        double pi = 3.1415926;
        System.out.println(pi);

        int rounded = (int)pi;
        System.out.println(rounded);

        int number = 1234;
        double overSampled = (double)number;
        System.out.println(number);

        String message = (String)"1234";
    }
}
