public class Main {
    public static void main(String[] args) {

     Circle c = new Circle(4);
     Square s = new Square(5);
     Rectangle r = new Rectangle(4,4);

    Shape2D[] shapes = new Shape2D[]{c,s,r};
    for (Shape2D sh1 : shapes)
    {
        System.out.println(sh1.getArea());
    }
        System.out.println();
    Cylinder cy = new Cylinder(5,5.);
    Sphere sp = new Sphere(4,4);
    pyramid py = new pyramid(3,3,3);
    Cone co = new Cone(2,2);

    Shape3D[] shape3D = new Shape3D[]{cy,sp,py,co};
    for (Shape3D sh2 : shape3D)
       System.out.println(sh2.getArea());
    }
}

