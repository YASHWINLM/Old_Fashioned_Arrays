package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		// TODO Auto-generated method stub
		boolean b=true;
		while (b) {
			b=false;
			for (int i = 0; i < testArray.length-1; i++) {
				int j=testArray[i].compareTo(testArray[i+1]);
				if (Math.abs(j)==j) {
					String s= testArray[i];
					testArray[i]=testArray[i+1];
					testArray[i+1]=s;
					b=true;
				}
			}
			
		}
		
	}

}
