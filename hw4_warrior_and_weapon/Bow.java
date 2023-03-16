public class Bow extends Weapon
{
    private int numberOfArrows;
    private int arrowsCapacity;

    public Bow()
    {
        this(20);
    }
    
    public Bow(int initialArrowsCapacity)
    {
        super();     // maximumAttackPoint with default 100

        arrowsCapacity = initialArrowsCapacity;
        numberOfArrows = arrowsCapacity;
    }

    /* To override */
    public void generateAttackPoint()
    {   
        int damage =  (int)(Math.random() *super.getMaximumAttackPoint()) + 1;
        System.out.println("Shooting an arrow...");
        System.out.println("Opponent damage will be " + damage);
    }

    /* To override */
    public void applyWeaponUse()
    {   
        numberOfArrows -= 1;
        System.out.println("Used up one arrow");
    }

    /* To override */
    public void printStatus()
    {
        System.out.println("Bow capacity for arrow: "+arrowsCapacity);
        System.out.println("Currently holds "+numberOfArrows+" arrows");

    }

    public int getNumberOfArrows()
    {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int n)
    {
        numberOfArrows = n;
    }

    public int getArrowsCapacity()
    {
        return arrowsCapacity;
    }

    public void setArrowsCapacity(int c)
    {
        arrowsCapacity = c;
    }
}
