package hw01.ModelElements;

import hw01.Staff.Point3D;

import java.util.ArrayList;
import java.util.List;

// create 3D-poligon (создает 3Д полигон)
public class Poligon {
    public List<Point3D> points;

    public Poligon(List<Point3D> points) {
        this.points = new ArrayList<>();
        points.add(new Point3D());
    }
}
