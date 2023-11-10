public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar((Car) new GasolinCar("CE74247", "Audi", "Audi A3 sportsback", 5, 28));
        fleet.addCar((Car) new DieselCar("DE45860", "Mercedes", "A-klasse", 4, 17, true));
        fleet.addCar((Car) new ElectricCar("BA200203", "Tesla", "Y", 4, 100, 238));


        System.out.println("Biler i flåden:");
        System.out.println(fleet);

        //Regner ud og udskriver den samlede registeringsafgift på bilerne i flåden.
        int totalFee = fleet.getTotalRegistrationFeeForFleet();
        System.out.println("Den samlede registreringsafgift for flåden: " + totalFee + " kr");
    }
}

