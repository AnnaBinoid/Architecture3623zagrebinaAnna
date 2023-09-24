package hw01.ModelElements;

import hw01.Staff.Angle3D;
import hw01.Staff.Point3D;
import hw01.Staff.moveShooting;

// create type of camera shooting (angle and points)
public class Camera implements moveShooting {
    public Point3D location;
    public Angle3D angle;

    public void rotate (Angle3D myCameraAngle){
    }

    public void move (Point3D myCameraPoint){
    }
}
