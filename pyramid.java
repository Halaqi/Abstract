public class pyramid extends Shape3D{

    public pyramid(int depth, int height ,int width)
    {
        super(depth,height,width);
    }
    public double getVolume() {

        return (depth*width*height)/3;
    }

    @Override
    public double getArea() {
        System.out.print("The area of the Pyramid  is: ");
        return depth*width+(0.5*depth+height);
    }


}
