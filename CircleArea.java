
/**
 * This program is to calculate the CircleArea.
 *
 * @author (Bibek Shrestha)
 * @version (28/08/2023)
 */
public class CircleArea
{
    // instance variables - replace the example below with your own
    private double radius = 2.5;
    private double area;

    /**
     * Constructor for objects of class CircleArea
     */
    public CircleArea()
    {
    }
    public static void main(String[] args){
        CircleArea circle1 = new CircleArea();
        circle1.getArea();
    }

    public void getArea()
    {
        this.area = this.radius *  this.radius * 3.14;
        System.out.println("The Circle Area = "+this.area);
    }
}
