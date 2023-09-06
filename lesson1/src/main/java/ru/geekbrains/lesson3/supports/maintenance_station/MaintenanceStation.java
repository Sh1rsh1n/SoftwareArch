

public class MaintenanceStation implements Maintenance{

    @Override
    public void changeOil(Car car){
        System.out.prontf("Выполняется замена масла в автомобиле %s %s", car.getBrand(), car.getModel());
    }
    
    @Override
    public void changeOil(Car car){
        System.out.prontf("Выполняется замена фильтров в автомобиле %s %s", car.getBrand(), car.getModel());
    }
}