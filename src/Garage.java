import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars;
    private String name;

    public Garage(String name) {
        this.cars = new ArrayList<>();
        this.name = name;
    }

    public void addParkedCar(Car parkedCar) {
        cars.add(parkedCar);
    }

    public double calculateGreenTaxForParkedCars() {
        double totalGreenTax = 0;
        for (Car car : cars) {
            totalGreenTax += car.calculateGreenTax();
        }
        return totalGreenTax;
    };

    @Override
    public String toString() {
        String s = "";
        s += "The " + name + " garage has the following cars parked: ";
        for (Car car : cars) {
            s += "\n" + car + "\n";
        }
        return s;
    }
}
