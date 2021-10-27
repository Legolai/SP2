public class Main {
    public static void main(String[] args) throws Exception {
        Garage parkinglot = new Garage("parkinglot");

        Benzincar op = new Benzincar("BG40323", "Volkwagen", "UP", "2018", 5, 1, 40);
        parkinglot.addParkedCar(op);

        Dieselcar bmw = new Dieselcar("HJ20192", "BMW", "M530", "2019", 5, true, 45);
        parkinglot.addParkedCar(bmw);

        Elcar tesla = new Elcar("JE20192", "Tesla", "S Performance", "2019", 5, 100, 600, 75.20);
        parkinglot.addParkedCar(tesla);

        System.out.println(parkinglot);
        System.out.println(
                "The total green tax for all parked cars is " + parkinglot.calculateGreenTaxForParkedCars() + " kr.");

    }
}
