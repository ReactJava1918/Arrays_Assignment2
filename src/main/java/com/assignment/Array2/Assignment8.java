package com.assignment.Array2;

/**
 * Hello world!
 *
 */
public class Assignment8 
{
    public static void main( String[] args )
    {
        int a[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n=a.length;
        int b=n;
        int temp[] =new int[n];
        int count =1;
        for(int i=0;i<n;i++)
        {
        	 
        	
        	if(i%2==0)
        	{
        		temp[i]=a[b-1];
        		
        		b--;
        		
        	 
        	}
        	
        	else
        	{
        		 
        		 
        		temp[i]=a[i-count];
        		 
        		count++;
        		
        	
        	
        	}
        	
        	
        }
        
        for (int i=0;i<n;i++)
        {
        	 
        	
        	 
        		  System.out.print(temp[i]+",");
        		 
        	
        	 
        
        
        
        
        }
        
    }
}
