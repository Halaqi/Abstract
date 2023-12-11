public class Cylinder extends Shape3D {
    public Cylinder (double height , double radius)
    {
        super(height,radius);
        this.height=height;
        this.radius=radius;
    }

    @Override
    public double getVolume() {
        return PI*radius*radius*height;
    }

    @Override
    public double getArea() {
        System.out.print("The area of the Cylinder is: ");
        return 2*PI*radius*radius+2*PI*radius*height;
    }


}
