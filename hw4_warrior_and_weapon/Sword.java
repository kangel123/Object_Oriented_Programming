public class Sword extends Weapon
{
    private double sharpness;
    private double deltaSharpness;

    public Sword()
    {
        sharpness = 1.0;
        deltaSharpness = 0.05;
    }


   /* To override */
   public void generateAttackPoint()
   {    
        int damage = (int)(sharpness *((Math.random() * super.getMaximumAttackPoint()) + 1));
       
        System.out.println("Slashing the sword...");
        System.out.println("Opponent damage will be " + damage+" with blade shapness "+ sharpness);

   }

   /* To override */
   public void applyWeaponUse()
   {
        sharpness -= deltaSharpness;
        System.out.println("Blade sharpness degraded by "+ deltaSharpness);
        
   }

   /* To override */
   public void printStatus()
   {
       System.out.println("Blade sharpness: "+sharpness);
   }


    /* getters and setters */

    public double getSharpness()
    {
        return sharpness;
    }

    public void setSharpness(double s)
    {
        sharpness = s;
    }

    public double getDeltaSharpness()
    {
        return deltaSharpness;
    }

    public void setDeltaSharpness(double d)
    {
        deltaSharpness = d;
    }

}
