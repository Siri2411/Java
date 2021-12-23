package CIE;
import java.util.Scanner;
public class student
{
	Scanner scan = new Scanner(System.in);
	public String usn, name;
	public int sem;

	public void accept()
	{
		System.out.println("Enter usn: ");
		usn = scan.nextLine();
		System.out.pritnln("Enter name: ");
		name = scan.nextLine():
		System.out.println("Enter sem: ");
		sem = scan.nextInt();
	}
		public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("USN: "+usn);
		System.out.println("Sem: "+sem);

	}
}
	

	