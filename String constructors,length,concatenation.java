/*A string is a sequence of characters. In JAVA this sequence of characters is enclosed within double quotes.
A String is a class that is defined in the JAVA lang package,therefore we can declare a string by creating an object.The String constructors are used for initialisation of string or setting up a null reference.To create an empty String,we can call default constructor.
for example:
String s=new String();
String Length: the length of String ,is the number of characters contained in it.The length() method can be used to obtain it.
for example:
String v="COMPUTER APPLICATIONS";
int len=v.length();
System.out.println(len);
Concatenation: Joining of more than one string together is called Concatenation. We can either use the + operator or use the concat() method to join 2 strings.
Program to join first name and last name which is passed as parameters to a method.*/
import java.util.*;
public class Main
{
    static void join(String fname,String lname)
    {
        String name;
        name=fname+" "+lname;
        System.out.println("your name = "+name);
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String fname,lname;
	    System.out.println("Enter the first name = ");
	    fname=sc.nextLine();
		System.out.println("Enter the last name = ");
		lname=sc.nextLine();
		join(fname,lname);
	}
}
/* It is possible to Concatenate Strings with other datatype ,but the resultant is always a String .
for example:*/
class Main
{
    public static void main(String[] args)
    {
        String s,s1=null,s2=null;
        s="one";
        int t=2;
        float h=3f;
        double d=3.0;
        s1=t+h+d+s;
        System.out.println(s1);
        System.out.println(s2);
    }
}
        
    


