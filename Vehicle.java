import java.time.Year;

public class Vehicle {

    public String brandname;
    public String modelname;
    public Year yearofmfg;
    public String color;
    public char fueltype; // p=petrol, e=electric, d=diesel, c=cng
    public float mileage;
    public float price;
    public int seats;

    private String mfgcode;
    private int noofservices;

    // Getters & Setters
    public void setMfgCode(String mCode){
        mfgcode = mCode;
    }

    public String getMfgCode(){
        return mfgcode;
    }

    public void setNoOfServices(int count){
        noofservices = count;
    }

    public int getNoOfServices(){
        return noofservices;
    }

    // Default Constructor
    public Vehicle(){
        brandname = "MG";
        modelname = "Hector";
        yearofmfg = Year.of(2025);
        color = "Red";
        fueltype = 'p';
        seats = 5;
        price = 115000.45f;
    }

    // Parameterized Constructor 1
    public Vehicle(String brandname, String modelName, float price, String color){
        this.brandname = brandname;
        this.modelname = modelName;
        this.price = price;
        this.color = color;
    }

    // Parameterized Constructor 2
    public Vehicle(char fueltype, float price, String mfgcode){
        this.fueltype = fueltype;
        this.price = price;
        this.mfgcode = mfgcode;
    }

    public void start() {
        System.out.println("Start Ignition by pressing the button");
    }

    public void drive() {
        System.out.println("Let's Go!");
    }

    public int accelerate(int initSp) {
        return initSp + 20;
    }

    public void stop() {
        System.out.println("Vehicle stopped!");
    }

    public float calcMileage(float fuelAmt, float distance) {
        return distance / fuelAmt;
    }
}