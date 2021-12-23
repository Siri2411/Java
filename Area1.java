class Area1
{
int a,b;
Area1(int x, int y)
{
a=x;
b=y;
}
double area()
{
System.out.println("Area is not defined");
return 0;
}
}
class Rectangle extends Area1
{
Rectangle(int x, int y)
{
super(x,y);
}
double area()
{
double C1;
C1=a*b;
return C1;
}
}
class triangle extends Area1
{
triangle(int x, int y)
{
super(x,y);
}
double area()
{
double t1;
t1 = 0.5*a*b;
return t1;
}
}
class Dispatcharea
{
public static void main(String args[])
{
Area1 a1 = new Area1(0,0);
Rectangle r1 = new Rectangle(15,30);
triangle t1 = new triangle(20,30);
Area1 r;
r=a1;
System.out.println("Area of Area1"+""+r.area());
r=r1;
System.out.println("Area of Rectangle"+""+r.area());
r=t1; 
System.out.println("Area of triangle"+""+r.area());
}
}