public class Drive implements Gear {
    private static Gear instance = new Drive();

    public static Gear getInstance() {
        return instance;
    }

    @Override
    public void Gearup(Car car) {
        System.out.println("Driving!!");
        car.setState(Drive.getInstance());
    }

    @Override
    public void Gearstay(Car car) {
        System.out.println("Driving!!");
        car.setState(Drive.getInstance());
    }

    @Override
    public void Geardown(Car car) {
        System.out.println("Netural");
        car.setState(Netural.getInstance());
    }
}
