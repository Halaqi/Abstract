public class Rectangle extends Shape2D{
    public Rectangle (double  height, double width)
    {
        super(height,width);
    }

    @Override
    public double getArea() {
        System.out.print("The area of the Rectangle is:  ");
        return height*width;
    }

}
