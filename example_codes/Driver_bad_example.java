public class Driver
{
    private String name;
    private Car car;
    private Truck truck;
    private Boat boat;

    public Driver(String driverName)
    {
        name = driverName;
    }

    /* method overloading */
    public void purchaseCar(Car c)
    {
        car = c;
    }

    public void purchaseTruck(Truck t)
    {
        truck = t;
    }

    public void purchaseBoat(Boat b)
    {
        boat = b;
    }

    public void drive(int speed)
    {
        if (car != null)
        {
            car.goForward(speed);
        }
        else if (truck != null)
        {
            truck.goFoward(speed);
        }
        else if (boat != null)
        {
            boat.goForward(speed);
        }
    }

    public static void main(String[] args)
    {
        Driver d = new Driver("john");

        //d.purchaseCar(new Car(4));
        d.purchaseTruck(new Truck(1000));
        d.drive(20);
    }
}
