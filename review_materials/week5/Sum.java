public class Sum
{
    public Sum()
    {

    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public double add(double d1, double d2)
    {
        return d1 + d2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public String add(String s1, String s2)
    {
        return s1 + s2;
    }

    public int add(int[] numbers)
    {
        int s = 0;

        for (int n: numbers)
        {
            s = s + n;
        }

        return s;
    }

    public static void main(String[] args)
    {
        Sum s = new Sum();
        System.out.println(s.add(1, 2));
        System.out.println(s.add(1, 2, 3));
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(s.add(data));
        System.out.println(s.add("Hello", "world"));
    }
}

