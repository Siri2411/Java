Import java.util.*;
class complex
{
int real, imaginary;
Complex(int tempReal, int tempImaginary)
{
real = tempReal;
imaginary = tempImaginary;
}
Complex addComp(Complex C1, Complex C2)
{
Complex temp = new Complex ();
temp.real = C1.real + C2.real;
temp.imaginary = C1.imaginary + C2.imaginary;
return temp;
}
}
void printComplexNumber ()
{
System.out.println("Complex number:" + real + "+" + imaginary +"i");

class GFG
{
public static void main(String args [])
{
Complex C1 = new Complex(3, 2);
C1.printComplexNumber();
Complex C2 = new Complex(9, 5);
C2.printComplexNumber();
Complex C3 = new Complex();
System.out.println("Sum of");
C3.printComplexNumber();
C3 = C3.subtractComp(C1, C2);
System.out.println("Difference of ");
C3.printComplexNumber();
}
