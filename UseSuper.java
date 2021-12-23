class A
{
int i;
A()
{
System.out.println("Inside A's constructor");
}
}
class B extends A
{
int i;
B(int x, int y)
{
super.i=x;
i=y;
}
}
void display()
{
System.out.println("Value of superclass variable is:"+" "+super.i);
System.out.prinln("Value of superclass variable is:"+" "+super.i);
}
class UseSuper
{
public static void main(String args[])
{
B b1 = new B(10,20);
b1.display();
}
}