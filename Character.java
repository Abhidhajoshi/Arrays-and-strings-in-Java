/***Character Data Type**
The Character data type is used to represwent a single character.A String is a group of characters.A character literal is always enclosed within a single quote.
Since java follows the Unicode system of representing characaters in the memory,It occupies 2 bytes of memory space.
You get the Unicode of a chracter by storing it into an integer variable or type casting it with int.*/

//program to check whether a character is upper case or lower case character or a digit.

class CharDemo
{
    static void test(char x)
    {
        if(x>='A'&&x<='Z')
             System.out.println("Upper case character");
        else if(x>'a' && x<='z')
            System.out.println("Lower case character");
        else if(x>'0'&& x<='9')
            System.out.println("Digit");
        else
            System.out.println("Not an Upper case/Lower case/digit ");
    }
}

/*You can increment or decrement a chracter to get the character before or after it.*/
