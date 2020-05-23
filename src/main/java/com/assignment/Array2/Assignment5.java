package com.assignment.Array2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
int a[]={4, 5, 6};
int[] temp=new int[a.length];

for(int i=0;i<a.length;i++)
{
	
	for(int j=0;j<a.length;j++)
	{ 
		if (i==j)
		{
			//temp[j]=a[j]-a[i];
		}
		else
		{
			temp[i]=a[j]+temp[i];
		}
		
	}
}

 for (int i=0;i<temp.length;i++)
 
 
 {
	 System.out.println(temp[i]);
 }
}

}