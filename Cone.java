public class Cone extends Shape3D {

    public Cone(double height , double radius)
    {
        super(height,radius);
        this.height=height;
        this.radius=radius;
    }

    public double getVolume() {


        return (1/3)*PI*radius*radius*height;
    }

    @Override
    public double getArea() {
        System.out.print("The area of the Cone is: ");
        return PI*radius*(radius+height);
    }
}
