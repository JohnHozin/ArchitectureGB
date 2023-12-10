package Seminar1.ModelElements;

import Seminar1.Other.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> Points = new ArrayList<>();

    public Poligon(Point3D points) {
        Points.add(points);
    }
}
