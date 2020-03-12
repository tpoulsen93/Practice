
public class DriverClass {

	public static void main(String[] args) {

		StringChanger str = new StringChanger("Jimmy");
		System.out.println(str.reverse());
		
		System.out.println();

		
		FizPop test = new FizPop(50);
		System.out.println(test.popper(3, 5));
		
		System.out.println();

		
		ArrayGenerator array1 = new ArrayGenerator(100, 100);
//		System.out.print(array1.toString());
		
		System.out.println();
		
		ArrayLimitFinder finder1 = new ArrayLimitFinder(array1.getArray());
		System.out.println("Min: " + finder1.findMin());
		System.out.println("Max: " + finder1.findMax());
	}

}
