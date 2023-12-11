public class Circle extends Shape2D{

    public Circle(double radius)
    {
     super(radius);
    }
    public double getArea()
    {
        System.out.print("The area of Circle:  ");
        return PI*radius*radius;
    }



}
