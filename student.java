import java.util.*;
class student
{
String name, USN;
int marks [i] = new int[3];
student(String USN, String name, int marks[3])
{
this.USN = USN;
this.name = name;
this.marks = marks;
}
void display(student stu)
{
system.out.Println("name:"+stu.name);
system.out.println("USN:"+stu.USN);
system.out.println("Percentage:"+stu.result());
}
float result ()
{
int total = marks[0]+marks[1]+marks[2];
}
}

public class StuDetails
{

public static void main(String args[])
{
String USN,name;
int marks[] = new int[3];

scanner sc = new scanner(System.in);
System.Out.Println("Enter the student details");
System.Out.Println("Name:");
name = sc.nextline();
System.Out.Println("USN:");
USN = sc.nextline();

for(i=0 ; i<3 ; i++)
{
System.Out.Println("Marks in subject"+ (i+1) + ":");
marks[i].sc.nextline();
}
students = new student(USN,name,marks);
System.Out.Println("Student details: \n");
S.display(S);
}
}