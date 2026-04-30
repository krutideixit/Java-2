import java.time.Year;

public class MainForVehicle {

    public static void printDetails(Vehicle v){
        System.out.println("-----------------------------------------");
        System.out.println("------------Vehicle Details--------------");
        System.out.println("-----------------------------------------");
        System.out.println("Brand Name: " + v.brandname);
        System.out.println("Model: " + v.modelname);
        System.out.println("Year of MFG: " + v.yearofmfg);
        System.out.println("Color: " + v.color);
        System.out.println("Fuel Type: " + v.fueltype);
        System.out.println("Seats: " + v.seats);
        System.out.println("Price: " + v.price);
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        printDetails(v);

        Vehicle v1 = new Vehicle("Toyota", "Camry", 250000.99f, "Red");
        v1.setMfgCode("MAH93e4");
        v1.seats = 5;
        printDetails(v1);

        Vehicle v2 = new Vehicle('d', 2000053.35f, "MAH68740");
        printDetails(v2);

        Vehicle[] fleet = {v, v1, v2};

        for (Vehicle vehicle : fleet) {
            printDetails(vehicle);
            vehicle.start();
            vehicle.drive();

            int speed = vehicle.accelerate(20);
            System.out.println("New Speed: " + speed);

            float mileage = vehicle.calcMileage(450, 55);
            System.out.println("Mileage = " + mileage);
        }
    }
}