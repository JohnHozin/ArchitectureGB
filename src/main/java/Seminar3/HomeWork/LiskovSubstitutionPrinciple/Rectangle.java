package Seminar3.HomeWork.LiskovSubstitutionPrinciple;

public class Rectangle {
    private int width;
    private int height;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}