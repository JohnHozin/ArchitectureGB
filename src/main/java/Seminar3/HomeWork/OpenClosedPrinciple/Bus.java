package Seminar3.HomeWork.OpenClosedPrinciple;

public class Bus extends Vehicle implements SpeedCalculation{
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    public double calculateAllowedSpeed() {
            return this.getMaxSpeed() * 0.6;
    }
}
