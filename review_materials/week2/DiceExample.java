import java.util.Random;

public class DiceExample
{
    public static int diceRoll(int n)
    {
        int number = (int)(Math.random() * n) + 1;      
        //Random r = new Random();
        //int number = r.nextInt(n) + 1;

        return number;
    }

    public static ArrayList<String> diceRollMultiple(int n, int times)
    {

    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; ++i)
        {
            System.out.println("A dice roll: " + diceRoll(383838));
        }
    }
}
