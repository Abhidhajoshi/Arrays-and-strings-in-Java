/*Binary Search: In this method the array when an element is to be searched should have the following characteristics:
1. The array should be in-order that is either ascending or descending order for numeric arrays and alphabetical order in case of characters and strings.
2. The start index and the last index of the array should be known.
3. If index position of the element this is to be searched is to be determined,then the elements in it should be unique.This is because whenever a match is found it quits from the searching process.Thus if there are more than one position the element that is to be searched for occurs,then upon first match the searching process exits and there is no way the indexes where it may occur can be determined.
The searching process can be understood with the following example,
let the array be arr=[12,15,20,35,46,58,60,79,95]
Thus first=0 indicates the starting index of the array from where it is to be searched.
similarly last=8 ,mid=(0+8)/2=4
if 79 is to be searched:
(0+8)/2=4,arr[4]<79 ;false condition
(5+8)/2=6 ,arr[6]<79; false condition
(7+8)/2=7 ,arr[7]==79: True condition
Program to implement Binary Search:*/
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr[]={12,15,20,36,42,55,60,83,92};
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int first=0,last=arr.length-1,mid,e;
        System.out.println("enter the element to be searched");
        e=sc.nextInt();
        while(first<=last)
        {
            mid=(first+last)/2;
            if(arr[mid]>e)
                last=mid-1;
            else if(arr[mid]<e)
                first=mid+1;
            else //a match is found
            {
                System.out.println("matched at index : "+mid);
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.println("not found");
    }
}
/* Linear Search can be applied when the array is unordered whereas binary search may be applied when the array is ordered.
            
