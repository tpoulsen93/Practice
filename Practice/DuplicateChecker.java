import java.util.ArrayList;
/**
 * 
 * This class isn't working yet :(
 *
 */
public class DuplicateChecker {

	int[] array;
	ArrayList<Integer> duplicates;
	int duplicateCount;
	
	public DuplicateChecker(int[] array1) {
		array = array1;
		duplicates = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length-1; i++) {
			for (int u = i+1; u < array.length; u++) {
				if (array[i] == array[u]) {
					duplicates.add(array[i]);
				}	
			}
		}	
	}
	
	
	public int getDuplicateCount() {
		return duplicates.size();
	}
	
	
	public ArrayList<Integer> getDuplicates() {
		return duplicates;
	}
	
	
	public String toString() {
		String result = "[";
		for (int i = 0; i < duplicates.size(); i++) {
			if (i + 1 == duplicates.size())
				result += duplicates.get(i);
			else
				result += duplicates.get(i) + ", ";
		}
		result += "]";
		return result;
	}	
}
