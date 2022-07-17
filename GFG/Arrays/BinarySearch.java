Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.
 
Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.
  
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int left = 0,right = n-1;
        int mid = (left+right)/2;
        
        if(left>right)
        {
            return -1;
        }
        
        while(left<=right)
        {
            if(arr[mid]<k)
            {
                left = mid+1;
            }
            else if(arr[mid] == k)
            {
                return mid;
            }
            else
            {
                right = mid-1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
}
