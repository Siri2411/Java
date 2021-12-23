class boxdemo
{
double height, length, breadth;

void setdim()
{
	height = 10;
	length = 20;
	breadth = 30;
}
 void methodbox()
{

	double vol = height*length*breadth;
	System.out.println("volume is:"+" "+vol);

}
}
class box
{
public static void main(String args[])
{
	boxdemo b1=new boxdemo();
	boxdemo b2=new boxdemo();	
	b1.setdim();
	b2.setdim();
	b1.methodbox();
	b2.methodbox();
}
}
