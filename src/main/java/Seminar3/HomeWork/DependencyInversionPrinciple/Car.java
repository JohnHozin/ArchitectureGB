package Seminar3.HomeWork.DependencyInversionPrinciple;

public class Car implements PetrolEngine{
    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
