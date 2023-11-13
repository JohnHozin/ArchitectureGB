package CarApp.HomeWork.SingleResponsibilityPrinciple;

public class CalculateSalary {
    private int baseSalary;

    public CalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }

}
