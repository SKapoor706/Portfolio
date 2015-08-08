//Aman Ibrahim
//IB CS

public class Circle
{
    public Circle(double r)
    {
        radius=r;
    }
    public double area()
    {
        double a=Math.PI*radius*radius;
        return a;
    }
     public double diameter()
    {
        double b= 2*radius;
        return b;
    }
    public double circumference()
    {
        double c=2*Math.PI*radius;
        return c;
    }
    public double radius;
}
    