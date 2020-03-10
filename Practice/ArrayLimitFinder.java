
public class ArrayLimitFinder {

	private int min, max;
	int[] array;
	
	public ArrayLimitFinder(int[] array) {
		this.array = array;
	}
	
	public int findMin() {
		min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		return min;
	}
	
	
	public int findMax() {
		max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}
	
	
	
	
	
}
