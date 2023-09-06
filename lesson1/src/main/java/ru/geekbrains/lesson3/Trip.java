public class Trip {
    
    private Car car;
    
    private Refueling refueling;
    
    private Cleaning cleaning;
    
    public Trip(Car car, Refueling refueling, Cleaning cleaning) {
        this.car = car;
        this.refueling = refueling;
        this.cleaning = cleaning;
    }
    
    public void start() {
        
        while(car.getDistance() != 10_000) {
            car.setCurrentSpeed(new Random().nextInt(250);
            Thread.sleep(1000);
            car.setDistance(car.getCurrentSpeed());
            fuelTank -= car.getCurrentSpeed();
            
            
            
            
        }
    }
}