import java.util.Scanner;
abstract class figure {
abstract void findRectangle(double l, double b);
abstract void findRectangle1(double l, double w);
abstract void findCircle(double r);
abstract void findTriangle(double b, double h);
}
class findArea extends figure {
void findRectangle(double l, double b)
{
double area = l*b;
System.out.println("Area of Rectangle: "+area);
}
void findRectangle1(double l, double w)
{ 
double perimeter = 2*(l+w);
System.out.println("Perimeter of Rectangle:"+perimeter);
}
void findCircle(double r)
{
double area = 3.14*r*r;
System.out.println("Area of Circle: "+area);
}
void findCircle1(double r)
{
double perimeter = 2*3.14*r;
System.out.println("Perimeter of Circle:"+perimeter);
}
void findTriangle(double b, double h)
{
double area = (b*h)/2;
System.out.println("Area of Triangle: "+area);
}
}
class area {
public static void main(String args[])
{
double l, b, h, r, w;
findArea area = new findArea();
Scanner get = new Scanner(System.in);
 
System.out.print("\nEnter Length & Breadth of Rectangle: ");
l = get.nextDouble();
b = get.nextDouble();
area.findRectangle(l, b);

System.out.print("\nEnter Length & Width of Rectangle:");
l = get.nextDouble();
w = get.nextDouble();
area.findRectangle1(l,w);
 
System.out.print("\nEnter Radius of Circle: ");
r = get.nextDouble();
area.findCircle(r);

System.out.print("\nEnter Radius of Circle:");
r = get.nextDouble();
area.findCircle1(r);

System.out.print("\nEnter Base & Vertical Height of Triangle: ");
b = get.nextDouble();
h = get.nextDouble();
area.findTriangle(b, h);
 
}
}   
