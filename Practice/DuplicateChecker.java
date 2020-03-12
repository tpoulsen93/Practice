import java.util.ArrayList;

public class DuplicateChecker {

	int[] array;
	ArrayList<Integer> duplicates;
	int duplicateCount, duplicateIndex;
	
	public DuplicateChecker(int[] array1) {
		array = array1;
		duplicateCount = duplicateIndex = 0;
		duplicates = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length-1; i++) {
			for (int u = i+1; u < array.length; u++) {
				if (array[i] == array[u]) {
					duplicates.add(array[i]);
					duplicateCount++;
				}	
			}
		}	
	}
	
	public int getDuplicateCount() {
		return duplicateCount;
	}
	
	public String getDuplicates() {
		String result = "";
		for (int i = 0; i < duplicates.size(); i++) {
			result += duplicates.get(i) + "\n";
		}
		return result;
	}	
}
