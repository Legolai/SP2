public abstract class Car {
    protected String regNr;
    protected String brand;
    protected String model;
    protected String year;
    protected int numberOfDoors;

    public Car(String regNr, String brand, String model, String year, int numberOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public abstract double calculateGreenTax();

    @Override
    public String toString() {
        return "--- Car --- \nbrand: " + brand + ", model: " + model + ", numberOfDoors: " + numberOfDoors + ", regNr: "
                + regNr + ", year: " + year;
    }

}
