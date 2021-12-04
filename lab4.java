import java.util.Scanner;
abstract class shape
{
int x,y;
abstract void printArea(double x,double y);
}
class Rectangle extends shape
{
void printArea(double x,double y)
{
System.out.println("Area of rectangle is :"+(x*y));
}
}
class Circle extends shape
{
void printArea(double x,double y)
{
System.out.println("Area of circle is :"+(3.14*x*x));
}
}
class Triangle extends shape
{
void printArea(double x,double y)
{
System.out.println("Area of triangle is :"+(0.5*x*y));
}
}
public class Main
{
public static void main(String[] args)
{
Rectangle r=new Rectangle();
r.printArea(4,10);
Circle c=new Circle();
c.printArea(3,5);
Triangle t=new Triangle();
t.printArea(4,7);
}
}
