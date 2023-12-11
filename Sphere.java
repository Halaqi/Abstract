public class Sphere extends Shape3D{
    int depth=(int)super.depth;
    public Sphere(int depth, double radius)
    {
        super(depth,radius);
        this.depth=depth;
        this.radius=radius;
    }
    public double getVolume() {

        return (4/3)+PI*radius*radius*radius;
    }

    @Override
    public double getArea() {
        System.out.print("The area of the Sphere is: ");
        return 4*PI*radius*radius;
    }


}
