Given an array, rotate the array by one position in clock-wise direction.

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
  
 class Compute {
    
    public void rotate(int arr[], int n)
    {
        int start = 0;
        int end = n-1;
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }
    }
}
