package com.assignment.Array2;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[]={0, 1, 0, 2, 0, 0, 2, 1, 2, 0};

int temp;

for(int i=0;i<a1.length;i++)
{ 
	for(int j=i+1;j<a1.length;j++)
	{
		if(a1[i]>a1[j])
		{
			temp=a1[i];
			a1[i]=a1[j];
			a1[j]=temp;
		}
		
	}
	
}

//sorting Array......................................
System.out.print("Sorting elements in array.......................");
for(int i=0;i<a1.length;i++)
{

	System.out.print(a1[i]);
}
System.out.println();
	}
}
