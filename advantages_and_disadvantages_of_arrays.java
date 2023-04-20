/***ADDING TWO MATRICES***/

//Program to add two 3x3 integer matrices

import.java.util.*;
class add2Matrices
{
    static void main()
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter value for the first matrix: ");
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                a[x][y]=sc.nextInt();
            }
        }
        System.out.println("Enter value for the second matrix: ");
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                b[x][y]=sc.nextInt();
            }
        }
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                c[x][y]=a[x][y]+b[x][y];
            }
        }
        System.out.println("Enter value for the first matrix: ");
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                 System.out.println(c[x][y]+"\t");
            }
            System.out.println();
        }
    }
}

/***ADVANTAGES OF ARRAYS**
->Gives a concise code as declaration,allocation of space and initialisation can be done in a single line.
-> Java arrays are dynamic, unlike other languages like C,C++.
-> It is possible to directly access any element, provided the index is known. Thus making manipulation easy.*/

/***DISADVANTAGES OF ARRAYS**
-> Arrays allows you to store ekements of only one data type, i.e., only hmogenous data can be stored, thus data of heterogenous data type cannot be stored, which is often required by a programmer.
-> Arrays always require contiguous free memory location to be allocated for storing elements. But there may be situations when the available memory is discrete in nature and therefore array cannot be used to efficiently use the memory.
-> Careful design is required to make sure that large lists of data can be stored.*/