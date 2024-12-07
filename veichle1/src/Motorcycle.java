public class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    public Motorcycle(String brand, String model, int year, boolean hasSidecar){
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }
    public boolean motor(){
        return hasSidecar;
    }
    public void setMotor(boolean motor){
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void start(){
        System.out.println(" Motorcycle is starting");
    }
    @Override
    public void stop(){
        System.out.println(" Motorcycle is stopping");
    }
}
