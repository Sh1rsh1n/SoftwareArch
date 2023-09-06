

public class SportCar extends Car implements Cleanable, Refuelable {

    private int maxSpeed; 
    
    public SportCar(String brand, String model, BodyType bodyType, CarColor color, FuelType fuelType, int maxSpeed) {
        super(brand, model, bodyType, color, fuelType)
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    @Override
    public void movement(){
        
        
    }
    
    @Override
    public void maintenance(){
        
        
    }
    
    @Override
    public void getFuel(){
        
    }
}