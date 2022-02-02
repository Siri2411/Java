Class A extends thread
{
	public void main()
{
	for(int i=1; i<=5; i++)
{
System.out.println("\t From thread A: i="+i);
}
System.out.println("Exit from A");
}
}
Class B extends thread
{
	public void main()
{
	for(int j=1; j<=5; j++)
{
System.out.println("\t From thread B: j="+j);
}
System.out.println("Exit from B");
}
}
Class C extends thread
{
	public void main()
{
	for(int k=1; k<=5; k++)
{
System.out.println("\t From thread C: k="+k);
}
System.out.println("Exit from C");
}
}
Class ThreadMethods
{
public static void main(String args[])
System.out.println("Start Thread A");
new A().start();
System.out.println("Start Thread B");
new B().start();
System.out.println("Start Thread C");
new C().start();
System.out.println("End of main Thread");
}
}
