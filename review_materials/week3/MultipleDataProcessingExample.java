public class MultipleDataProcessingExample
{
    public static double calculateMean(int[] data)
    {
        double mean; 

        /* find mean using for loop */
        int sum = 0;

        for (int i = 0; i < data.length; ++i)
        {
            sum = sum + data[i];
        }

        mean = (double)sum / data.length;

        return mean;
    }

    public static void main(String[] args)
    {
        int[] scores = {80, 90, 86, 92, 91, 88, 100, 50};

        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}


