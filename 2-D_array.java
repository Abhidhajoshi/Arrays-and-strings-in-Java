/***2-DIMENSIONAL ARRAY**
The arrays, which were defined previously are called single dimensional array as it uses only a single dimensional array as it uses only a single subscript.
Java, as with most languages, supports multi-dimensional arrays-1-dimensional,2-dimensional,3-dimensional, etc., depending upon the number of subscripts.
Two dimensional arrays are reffered by 2 indexes or subscripts, first one called the row and second one called the column. Two dimensional arrays are also referred to as matrix or tables.*/

/***DECLARATION OF TWO-DIMENSIONAL ARRAYS**
Before we use an array, we need to declare it like any other variable to allocate space in the memory. 
The general syntax is:
type array-name[][];
or
type[][] array-name;

->After declaring the array it is necessary to create spaces in memory. The general syntax is:
type array-name[][]=new type [row-size][column-size];*/

//Program to initialise a matrix and find their sum.
public class Arrays 
{
    static void SumArray()
    {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}}; 
        int x,y,s=0;
        for (x=o;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                s=s+a[x][y];
            }
        }
        System.out.println("sum= "+s);
    }
}

//Printing a 2D array in matrix format 
class MatrixPrinting
{
    static void main()
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
