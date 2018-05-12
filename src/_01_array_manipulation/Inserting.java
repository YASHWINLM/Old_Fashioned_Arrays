package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int x, int y) {
		// TODO Auto-generated method stub
		 int[] TestArray= {testArray.length+1};
		 for (int i = 0; i < TestArray.length; i++) {
			TestArray[i]+=testArray[i];
		}
		TestArray[x]=y;
		return TestArray;
	}
	
}
