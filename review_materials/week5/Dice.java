import java.util.Random;

public class Dice
{
    /* attributes (instance variables) */
    private int sides;

    /* methods */
    /* constrcutor */
    public Dice()
    {
        sides = 6;
    }

    public Dice(int n)
    {
        sides = n;
    }

    /* generate an int randon number starting from start ending at end */
    private int generateRandomNumber(int start, int end)
    {
        //int randomNumber = (int)(Math.random() * (end + 1 - start)) + start;
        
        Random r = new Random();

        int randomNumber = r.nextInt(end + 1 - start) + start;

        return randomNumber;
    }

    public int singleRoll()
    {
        int randomNumber = generateRandomNumber(1, this.sides);

        return randomNumber;
    }

    public int[] multipleRolls(int rolls)
    {
        int[] randomNumbers = new int[rolls];

        for(int i = 0; i < rolls; ++i)
        {
            //randomNumbers[i] = singleRoll();
            randomNumbers[i] = generateRandomNumber(1, this.sides);
        }

        return randomNumbers;
    }

    /* getter and setters */

    public int getSides()
    {
        return sides;
    }

    public void setSides(int updateSides)
    {
        sides = updateSides;
    }

    public String toString()
    {
        return "Dice with sides: " + sides;
    }

    /* main() method */
    public static void main(String[] args)
    {
        Dice defaultDice = new Dice();      /* a dice with 6 sides as a default */

        /* dice with 6 side */
        Dice d = new Dice(6);

        System.out.println(d);

        System.out.println(d.singleRoll());

        int[] r = d.multipleRolls(10); 

        System.out.println("### Multiple rolls");
        for (int e: r)
        {
            System.out.println(e);
        }

        /* dice with 24 sides */
        Dice d2 = new Dice(24);
        System.out.println("*** Dice with 24 sides");
        System.out.println(d.singleRoll());

        int[] r2 = d2.multipleRolls(10); 

        System.out.println("### Multiple rolls");
        for (int e: r2)
        {
            System.out.println(e);
        }
    }
}
