package _01_array_manipulation;

import junit.framework.Test;

public class Inserting {

	public static int[] insertAt(int[] testArray, int x, int y) {
		// TODO Auto-generated method stub
		 int[] TestArray1= new int [testArray.length+1];
		 for (int i = 0; i < x; i++) {
			 TestArray1[i]=testArray[i];
			 
			
		}
		
		 for (int i = x+1; i <TestArray1.length; i++) {
			 TestArray1[i]=testArray[i-1];
		}
		 
		TestArray1[x]=y;
		return TestArray1;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		 String[] TestArray= new String [orderedArray.length+1];
		 TestArray[TestArray.length-1]=string;
		 for (int i = 0; i < TestArray.length-1; i++) {
			TestArray[i]=orderedArray[i];
		}
		 boolean b=true;
			while (b) {
				b=false;
				for (int i = 0; i < TestArray.length-1; i++) {
					int j=TestArray[i].compareTo(TestArray[i+1]);
					if (Math.abs(j)==j) {
						String s= TestArray[i];
						TestArray[i]=TestArray[i+1];
						TestArray[i+1]=s;
						b=true;
					}
				}
				
			}
		 
		return TestArray;
		
		
		
	}
	
}
