package in.mukeshit.beans;

public class I20Car implements Vehicle {

    @Override
    public void cleanVehicle() {
        System.out.println("i20 car is getting cleaned");
    }

    @Override
    public void sensor() {
        System.out.println("overridden sensor() method");
    }
}
