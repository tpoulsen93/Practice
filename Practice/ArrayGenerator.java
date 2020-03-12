import java.util.*;

public class ArrayGenerator {
	
	private int[] array;
	
	//default version where the int array will operate within the domain of 0-9
	public ArrayGenerator(int arraySize) {
		array = new int[arraySize];
		Random rand = new Random();
	
		for (int i = 0; i < arraySize; i++) {
			array[i] = rand.nextInt(10);
		}
	}


	//This method allows the random numbers domain to be chosen
	public ArrayGenerator(int arraySize, int randomCap) {
		array = new int[arraySize];
		Random rand = new Random();
		
		for (int i = 0; i < arraySize; i++) {
			array[i] = rand.nextInt(randomCap);
		}
	}
	
	
	public int[] getArray() {
		return array;
	}
	
	
	public String toString() {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if (i + 1 == array.length)
				result += array[i];
			else
				result += array[i] + ", ";
		}
		result += "]";
		return result;
	}
}		

