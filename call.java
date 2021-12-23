abstract Class samples
{
astract void Callme();
void CallMeToo()
{
System.our.println("CallMeToo is abstract class");
}}
Class Inabst extends sample
{
void Callme()
{
System.out.println("Callme method in subclass overriden");
}}
Class sample abstract 
{
public static void main(String args[])
{
Inabst ob = new Inabst();
ob.Callme()
ob.CallMeToo();
}}

