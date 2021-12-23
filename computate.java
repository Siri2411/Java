//Simple Interest,area of circle and area of cydliner - program

import java.util.*;
class compute
{
double computation(double p,int t,double r)
{
return ((p*r*t)/100);
}
double computation(int r)
{
return (3.14*r*r);
}
double computation(int r, int h)
{
return (3.14*r*r*h);
}

public static void main(String args[])

{ 
	compute co =new compute();
double interest=co.computation(100.23,2,7);
	double circle=co.computation(4);
     double cylinder=co.computation(6,7);
	System.out.println("simple interest="+ " "+ interest);
	System.out.println("area of a circle="+" "+circle);
	System.out.println("area of a cylinder="+" "+cylinder);
}
}