/*Array variables are references to a block of elements: When an array variable is declared,Java reserves only enough memory for a reference to an array object.References typically require only 4bytes.When an array object is created with new,a reference is returned,and that reference can be assigned to a variable.
program to input 10 numbers into an integer array and replace all even numbers in it by 0 */
import java.util.*;
class Arraydemo
{
    static void replace()
    {
        int i,a[]=new int [10],b[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements : ");
        for(i=0;i<a.length;i++)
            a[i]=sc.nextInt(); //accept value for each StackTraceElement
        b=a; // b is reference variable for a
        for(i=0;i<10;i++)
        {
            if(b[i]%2==0)
                b[i]=0;
        }
        for(i=0;i<10;i++)
            System.out.println(a[i]+" ");
    }
}
/* Array when passed to a method is always call by reference.
program to show how arrays are passed as parameters within a function.*/
class Arraydemo1
{
    static void twice(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=2*a[i];
        }
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
        System.out.println("Original Array....");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+"\t");
        twice(a);
    System.out.println("Inupdated Array");
    for(int i=0;i<a.length;i++)
        System.out.println(a[i]+"\t");
    }
}
/*Searching in Arrays: Searching is the process of looking for the presence of a key value in an array.A key is a value that is being searched in an array.
 1. Linear Search: Here an element that needs to be searched will be compared with each and every element of the array.If match is found a match flag is raised otherwise no-match flag is raised.This type of searching is raw and can be used in an array whose elements may be in any order.
 program to implement Linear Search. */
import java.util.*;
class Main
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int ar[]={2,3,4,5,6,7,8,12,13,14};
         int e;
         System.out.println("Enter the element to be searched");
         e=sc.nextInt();
         boolean flag=false;
         for(int i=0;i<ar.length;i++)
         {
             if(e==ar[i]) //if found
             {
                 System.out.println("found at index :" +i);
                 flag=true;
             }
         }
         if (!flag) // in case not found
         System.out.println("not found");
     }
 }
    