package com.assignment.Array2;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment6 {

	public static void main(String[] args) { 
		
		TreeSet a=new TreeSet();
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(6);
		 Iterator i1=a.iterator();
		 int count=1;
		 while (i1.hasNext())
		 {
			 Integer i13=(Integer)i1.next();
			 if(count<=2)
			 {
				 System.out.println(i13);
				 count++;
			 }
			 
		 }
		
		
	}
}
