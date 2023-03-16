import java.util.ArrayList;

public class ProcessListExample
{
    public static void main(String[] args)
    {
        System.out.println("Before calling processList(): ");
        for (String element: list)
        {
            System.out.println(element);
        }

        processList(list);

        System.out.println("After calling processList(): ");
        for (String element: list)
        {
            System.out.println(element);
        }
    }
}
