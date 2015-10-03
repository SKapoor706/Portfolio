public class Automobile
{
    public Automobile(double m) // Accepts value m to the double mpg. Also declares
    {
         mpg = m;
        double gallons;
    }
    public void fillUp(double f) // Adds fuel to the tank
    {
        gallons += f;
    }
    public void takeTrip(double t) // Takes away fuel from the tank depending upon how many miles are driven
    {
        gallons -= t / mpg; // Not sure how to do this line. For some reason, when I reference mpg, the output of Tester is "-infinity". Shouldn't it do gallons = gallons - (miles driven / mpg)?
    }
    public double reportFuel() // Returns value of how much fuel is left in tank
    {
        double r = gallons;
        return r;
    }
    public double mpg;
    public double gallons;
}