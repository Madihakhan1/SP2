public class ElectricCar extends ACar {
    private final int batteryCapacityKwh;
    private final int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKwh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public double getBatteryCapacityKWh() {
        return batteryCapacityKwh;
    }

    public double getMaxRangeKm() {
        return maxRangeKm;
    }

    public double getWhPrKm() {
        return ((double) batteryCapacityKwh / maxRangeKm) * 1000;
    }

    @Override
    public int getRegistrationFee() {
        //Omregner fra Wh/km til km/1
        double kmPrLitreEquivalent = 100 / (getWhPrKm() / 91.25);
        return 0;
    }
}
