public class Trip {
    
    private Car car;
    
    private int tripDistance;
    
    private Refueling refueling;
    
    private Cleaning cleaning;
    
    public Trip(Car car, Refueling refueling, Cleaning cleaning, int tripDistance) {
        this.car = car;
        this.refueling = refueling;
        this.cleaning = cleaning;
        this.tripDistance = tripDistance;
    }
    
    public void start() {
        
        while(car.getDistance() <= tripDistance) {
            car.setCurrentSpeed(new Random().nextInt(car.getMaxSpeed());
            Thread.sleep(1000);
            car.setDistance(car.getCurrentSpeed());
            
            
            
            
            
        }
    }
}