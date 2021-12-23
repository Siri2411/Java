import java.util.*;
class calculate
{
double p,r,t,ra,rah,height;
void dim()
{
	p=124.56;
	t=6;
	r=9;
	ra=4;
	rah=5.9;
	height=10;
}
	double interest()
{
	return(p*r*y);
}
	double circle()
{
	return(3.14*r*r);
}
	double cylinder()
{
	return(2*3.14*rah*height);
}
	public static void main(String args[])
{
	calculate cal=new calculate();
	cal.dim();
	System.out.println("interest=*+ " " +cal.interest());
	System.out.println("area of circle=*+ " " +cal.circle());
	System.out.println("area of cylinder=*+ " " +cal.cylinder());
}}
