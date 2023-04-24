/* Extraction of a Character from a String: To extract a Character from a String you can use the charAt() method.This method is used to extract a character from a given position/index.Position needs to be in parenthesis.The position of a character in a String always begins from 0(zero).
Program to input a sentence and print each character in different lines.*/
public class Characters
{
    static void characterwise(String sent)
    {
        int len;
        len=sent.length();
        for(int i=0;i<len;i++)
        {
            System.out.println(sent.charAt(i));
        }
    }
}
/* When the characterWise() function is executed.BlueJ allows you to pass a sentence as parameter,but while doing so ensure that the sentence is enclosed in double quotes.
Program to input a sentence and count the total number of A in it.*/
public class Characters
{
    static void count(String sent)
    {
        char c;
        int len,count=0;
        len=sent.length();
        for(int i=0;i<len;i++)
        {
            c=sent.charAt(i); //extract each Characters
            if(c=='A' || C=='a')
            count++;
        }
        System.out.println("Number of A is = " +count);
    }
}
/* When the count() function is executed,you need to enter a sentence within double quotes for the parameter sent.The for loop now iterates each time,extracting each character and checking whether it is an A or a or not.If it is the value of count is increased by 1.
Program to extract each word from a given sentence.*/
class Main
{
    public static void main(String[] args)
    {
        String s="He went to the market";
        String w="";
        int i;
        char x;
        s=s+" "; // add a space at the end of the sentence
        for(i=0;i<s.length();i++)
        {
            x=s.charAt(i);
        if(x!=' ')
        w=w+x;
        else
            {
             System.out.println(w);
             w="";
            }
        }
    }
}

