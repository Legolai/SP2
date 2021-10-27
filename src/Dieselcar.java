public class Dieselcar extends Car {

    private boolean hasParticleFilter;
    private double kmPrL;

    public Dieselcar(String regNr, String brand, String model, String year, int numberOfDoors,
            boolean hasParticleFilter, int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    private boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        String car = super.toString();
        car += "\n--- Specs --- \nkmPrL: " + kmPrL + ", Particle Filter: " + (hasParticleFilter ? "yes" : "none");
        return car;
    }

    @Override
    public double calculateGreenTax() {
        double greenTax = 0;
        double countervailingCharge = 0;

        if (kmPrL > 20 && kmPrL <= 50) {
            greenTax = 330;
            countervailingCharge = 130;
        } else if (kmPrL > 15 && kmPrL <= 20) {
            greenTax = 1050;
            countervailingCharge = 1390;
        } else if (kmPrL > 10 && kmPrL <= 15) {
            greenTax = 2340;
            countervailingCharge = 1850;
        } else if (kmPrL > 5 && kmPrL <= 10) {
            greenTax = 5500;
            countervailingCharge = 2770;
        } else if (kmPrL <= 5) {
            greenTax = 10470;
            countervailingCharge = 15260;
        }

        greenTax += countervailingCharge + (hasParticleFilter ? 0 : 1000);

        return greenTax;
    }
}
