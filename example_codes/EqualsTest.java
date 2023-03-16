public class EqualsTest
{
    public static void main(String[] args)
    {
        Mage m1 = new Mage(null);
        Mage m2 = new Mage(null);

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
    }
}
