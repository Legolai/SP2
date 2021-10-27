public class Benzincar extends Car {

    private int octaneNumber;
    private double kmPrL;

    public Benzincar(String regNr, String brand, String model, String year, int numberOfDoors, int octaneNumber,
            int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    @Override
    public String toString() {
        String car = super.toString();
        car += "\n--- Specs --- \nkmPrL: " + kmPrL + ", octaneNumber: " + octaneNumber;
        return car;
    }

    @Override
    public double calculateGreenTax() {
        double greenTax = 0;

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
