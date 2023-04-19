/*Selection sort : Here we take each element from the array,starting from the other index and among the rest of the elements find the smallest (in case of ascending),and then interchange the first number with the smallest number.
The same process continues with the subsequent numbers,until all numbers are exhausted (i.e.,each number is checked),the resultant array is the desired array with elements in it in ascending order.
Suppose we are given an array with the following elements, which we intend to sort in ascending order.
arr[]={5,2,1,6,3}
The status of the array after each pass is shown below:
Pass 1: The smallest element from arr[0] to arr[4] is found and interchanged with arr[0].
 arr[]={1,2,5,6,3}
Pass 2: The elements arr[1] to arr[4] will be checked for smallest and then interchanged with arr[1].
 arr[]={1,2,5,6,3}
Pass 3: The elements arr[2] to arr[4] will be checked for smallest and then interchanged with arr[2].
 arr[]={1,2,3,6,5}
Pass 4: The elements arr[3] to arr[4] will be checked for smallest and then interchanged with arr[3].
 arr[]={1,2,3,5,6}
Program to perform sorting in ascending order,using Selection sorting technique:*/
class Main
{
 public static void main(String[] args)
 {
     int i,j;
     int arr[]={4,45,65,36,14,2,8,16,9};
     for(i=0;i<arr.length-1;i++)
     {
         int smallest=arr[i],pos=i;
         for(j=i+1;j<arr.length;j++)
         {
             if(arr[j]<smallest)
             {
                 smallest=arr[j];
                 pos=j;
             }
         }
         arr[pos]=arr[i];
         arr[i]=smallest;
     }
     for(i=0;i<arr.length;i++)
     System.out.println(arr[i]+" ");
 }
}
/* There is only one interchange that occurs with each pass.Selection Sorting is not possible at the middle of the iteration after a pass,whether the array got sorted or not.*/
