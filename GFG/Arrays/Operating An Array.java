Given an array A of size N, your task is to do some operations, i.e., search an element, insert an element, and delete an elementby completing the functions. 
Also, all functions should return a boolean value.

Input:
5
2 4 1 0 6
1 2 2 0
Output:
1 1 1

class GfG
{		
	public boolean searchEle(int a[],int x)
    {
		//add code here.
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==x)
		    {
		        return true;
		    }
		}
		return false;
	}
	public boolean insertEle(int a[],int y,int yi)
        {
              //add code here.
              if(yi<a.length)
              {
                a[yi] = y;
                return true;
              }
              return false;
	}
	public boolean deleteEle(int a[],int z)
        {
		//add code here.
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==z)
		    {
		        count++;
		        return true;
		    }
		}
		if(count==0)
		return true;
		
		return false;
	}
}
