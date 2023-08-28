
/**
 * This program is to calculate the CircleArea.
 *
 * @author (Bibek Shrestha)
 * @version (28/08/2023)
 */
import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        CircleArea circle1 = new CircleArea();
        circle1.getArea(radius);
    }

    public void getArea(double radius)
    {
        this.area = radius * radius * 3.14;
        System.out.println("The Circle Area = "+this.area);
    }
}
