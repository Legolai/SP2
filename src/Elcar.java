public class Elcar extends Car {

    private int batteryCapacityKWh;
    private int maxKm;
    private double whPrKm;

    public Elcar(String regNr, String brand, String model, String year, int numberOfDoors, int batteryCapacityKWh,
            int maxKm, Double whPrKm) {
        super(regNr, brand, model, year, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        String car = super.toString();
        car += "\n--- Specs --- \nbatteryCapacityKWh: " + batteryCapacityKWh + ", maxKm: " + maxKm + ", whPrKm: "
                + whPrKm;
        return car;
    }

    @Override
    public double calculateGreenTax() {
        double greenTax = 0;
        double kmPrL = 100 / (whPrKm / 91.25);

        if (kmPrL > 20 && kmPrL <= 50) {
            greenTax = 330;
        } else if (kmPrL > 15 && kmPrL <= 20) {
            greenTax = 1050;
        } else if (kmPrL > 10 && kmPrL <= 15) {
            greenTax = 2340;
        } else if (kmPrL > 5 && kmPrL <= 10) {
            greenTax = 5500;
        } else if (kmPrL <= 5) {
            greenTax = 10470;
        }

        return greenTax;
    }
}
