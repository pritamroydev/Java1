interface Vehicle{
    void start();
    void stop();
    double getServiceCost();
}

interface ElectricVehicle{
    void chargeBattery();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
    public double getServiceCost(){
        return 5000;
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike started");
    }
    public void stop(){
        System.out.println("Bike stopped");
    }
    public double getServiceCost(){
        return 1000;
    }
}

class EVCar implements Vehicle, ElectricVehicle{
    public void start(){
        System.out.println("EVCar started");
    }
    public void stop(){
        System.out.println("EVCar stopped");
    }
    public double getServiceCost() {
        return 3000;
    }
    public void chargeBattery(){
        System.out.println("EV Car battery is charging...");
    }
}

public class Main{
    public static void main(String []args){
        Vehicle[] vehicles = new Vehicle[3];
        
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new EVCar();

        for(Vehicle v: vehicles){
            v.start();
            v.stop();
            System.out.println("Service cost: Rs."+v.getServiceCost());

            if (v instanceof ElectricVehicle){
                ((ElectricVehicle) v).chargeBattery();
            }
        }
        
    }
}