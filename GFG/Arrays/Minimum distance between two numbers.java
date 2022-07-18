You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.
  nput:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
  
  
  
  
  
  class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code here
        int in1=-1,in2=-1;
        int dist = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                in1=i;
            }
            else if(arr[i]==y)
            {
                in2 = i;
            }
            if(in1!=-1 && in2!=-1)
            {
                dist = Math.min(dist,Math.abs(in2-in1));
            }
        }
       
        if(in1==-1||in2==-1)
        return -1;
        return dist;
    }
}
