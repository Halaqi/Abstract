public abstract class Shape2D {
    final double PI=3.14d;
    double height;
    double radius;
    double width;

   public Shape2D(double height, double width)
   {
       this.height=height;
       this.width=width;
   }
    public Shape2D(double radius)
    {
        this.radius=radius;

    }
    public abstract double getArea();

    public String toString()
    {
        return "Height:  "+height+"Width:  "+width+"Radius:  "+radius;
    }
}
