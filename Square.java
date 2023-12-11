public class Square extends Shape2D {
    public Square(double width)
    {
        super(width);
        this.width=width;
    }
    @Override
    public double getArea()
    {  System.out.print("The area of the Square is: ");
        return width*width;
    }


}
