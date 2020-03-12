
public class FizPop {

	private int sample;		//sample size
	
	public FizPop(int num) {
		sample = num;
	}
	
	
	public String popper(int num1, int num2) {
		String result = "";
		
		for (int i = 1; i <= sample; i++) {
			if (i % (num1 * num2) == 0)
				result += "fizpop(" + i + ")";
			else if (i % num1 == 0)
				result += "fiz(" + i + ")";
			else if (i % num2 == 0)
				result += "pop(" + i + ")";
		}	
		return result;
	}
}
