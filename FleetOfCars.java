import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();
    void addCar(Car car) {


    }

    int getTotalRegistrationFeeForFleet()  {

        return 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (Car c:
                fleet) {
            result += c;
        }
        return result;
    }
}