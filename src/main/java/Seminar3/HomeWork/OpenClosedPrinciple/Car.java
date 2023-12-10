package Seminar3.HomeWork.OpenClosedPrinciple;

public class Car extends Vehicle implements SpeedCalculation{
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.8;
    }
}
