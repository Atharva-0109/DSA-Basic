Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
  
  class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int num1 = m-l+1;
         int num2 = r-m;
         
         int[] arr1 = new int[num1];
         int[] arr2 = new int[num2];
         
         for(int i=0;i<num1;i++)
         {
             arr1[i] = arr[l+i];
         }
         for(int j=0;j<num2;j++)
         {
             arr2[j] = arr[m+j+1];
         }
         
         int i=0,j=0,k=l;
         
         while(i<num1 && j<num2)
         {
             if(arr1[i]<arr2[j])
             {
                 arr[k] = arr1[i];
                 i++;
             }
             else
             {
                 arr[k] = arr2[j];
                 j++;
             }
             k++;
         }
         while(i<num1)
         {
             arr[k] = arr1[i];
             k++;
             i++;
         }
         while(j<num2)
         {
             arr[k] = arr2[j];
             j++;
             k++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r)
        {
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        
    }
}
