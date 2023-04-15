/* **ARRAYS**
Arrays in Java are categorised as single dimensional arrays (1D Arrays) and multidimensional arrays.The dimensions represents the number of indexes used to indicate the position of an element in the array.*/

/* **DECLARATION OF ARRAYS**
An array declaration names the array, specifies the type of its elements and define the number of elements in the array.
The general syntax is: 
type array-name[];
or 
type[] array-name;
After declaring the array, it is necessary to create spaces in memory. This is done using the new command.
The general syntax is: 
type array-name[]=new type[size];*/

/* **INITIALISATION OF ARRAYS**
Like any other variables even an array can be initialised. You can initialise the elements of array in the same way as the ordinary variables when they are declared.The general form of Initialisation of array is:
type array-name[]={list of values};*/

/* **TRAVERSING AN ARRAY**
Traversing involves automating the process of accessing individual elements in an array. To traverse an array you need to use a loop to indicate the index of each element of the array.*/

public class Main
{
	public static void main(String[] args) {
	    int i;
	    int arr1[]={9,7,5,3,1};
	    for(i=0;i<5;i++)
		System.out.println(arr1[i]);
	}
}

/* **THE LENGTH OF AN ARRAY**
The length of an array is the number of elements in the array.
To determine the length of an array, the following syntax may be used:
<array-name>.length;
*/
public class Main
{
	public static void main(String[] args) {
	    int i;
	    int arr1[]={9,7,5,3,1};
	    for(i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
	}
}

