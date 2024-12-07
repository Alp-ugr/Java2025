public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String brand, String model, int year, int numberOfDoors){
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void start(){
        System.out.println(" Car is starting");
    }
    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }
}
