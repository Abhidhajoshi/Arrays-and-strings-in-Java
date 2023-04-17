/***SORTING**
Sorting is a method of rearranging the elements in an array, so that it occurs either in ascending or descending order. Various methods of sorting are available.

->BUBBLE SORTING
The bubble sort makes multiple passes through an array. It compares adjacent elements and exchanges (or swaps) those that are out of order. Each pass through the list places the next largest value im its proper place.
In essence, each element "bubbles" up to the location where it belongs.
*/

class SortArray
{
    static void bubbleSorting()
    {
        int i,j,temp;
        int arr[]={4,45,65,34,12,3,9,17,8};
        for(i=arr.length-1;i>0;i--)
        {
            for(j=0;j<1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        fo(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}

/*
-> Bubbe sort sometimes reffered to as sinking sort, is a simple sorting algorithm taht repeaedly steps through the list to be sorted,compares each pair of adjacent items and swaps them if they are in wrong order.*/