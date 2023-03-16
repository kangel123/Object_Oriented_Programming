public class DecrementArrayExample
{
    public static void decrementArray(int[] list)
    {
        for (int i = 0; i < list.length; ++i)
        {
            list[i] = list[i] - 1;
        }
    }

    public static void main(String[] args)
    {
        int[] n = new int[3];

        n[0] = 10;
        n[1] = 11;
        n[2] = 12;

        System.out.println("Before calling decrement(): ");
        for (int element: n)
        {
            System.out.println(element);
        }

        decrementArray(n);

        System.out.println("After calling decrement(): ");
        for (int element: n)
        {
            System.out.println(element);
        }
    }
}
