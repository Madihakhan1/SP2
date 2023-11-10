public abstract class ACar implements Car{

    private String registrationNumber;
    private String make;
    private String model;

    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
    }


    String GetRegistrationNumber() {

        return registrationNumber;
    }

    public  String getMake(){

        return make;

    }

    public String GetModel(){

        return model;

    }
    public  int GetNumberOfDoors(){

        return 0;

    }

    @Override
    public String toString() {
        return "ACar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}