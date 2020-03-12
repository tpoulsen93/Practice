
public class DriverClass {

	public static void main(String[] args) {
/*
		StringChanger str = new StringChanger("Jimmy");
		System.out.println(str.reverse());
		
		System.out.println();
*/
/*		
		FizPop test = new FizPop(50);
		System.out.println(test.popper(3, 5));
		
		System.out.println();
*/
		
		ArrayGenerator array1 = new ArrayGenerator(10, 100);
		System.out.println("Array 1: " + array1.toString());
		int[] randomArray1 = array1.getArray();

		System.out.println();
		
		ArrayLimitFinder finder1 = new ArrayLimitFinder(randomArray1);
		System.out.println("Min: " + finder1.findMin());
		System.out.println("Max: " + finder1.findMax());
		
		System.out.println();
		
		ArrayGenerator array2 = new ArrayGenerator(20, 10);
		System.out.println("Array 2: " + array2.toString());
		int[] randomArray2 = array2.getArray();
		
		System.out.println();
		
		DuplicateChecker duplicates = new DuplicateChecker(randomArray2);
		System.out.println("Array 2 has " + duplicates.getDuplicateCount() + " duplicate elements:");
		System.out.println(duplicates.toString());
		
	}

}
