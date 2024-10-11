public class Reverse implements Gear{
    private static Gear instance = new Reverse();

    public static Gear getInstance() {
        return instance;
    }

    @Override
    public void Gearup(Car car) {
        System.out.println("Netural");
        car.setState(Netural.getInstance());
    }

    @Override
    public void Gearstay(Car car) {
        System.out.println("Reversing!!");
        car.setState(Reverse.getInstance());
    }

    @Override
    public void Geardown(Car car) {
        System.out.println("Parking!!");
        car.setState(Parking.getInstance());
    }
}
