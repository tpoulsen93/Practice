
public class StringChanger {

	private String original;
	private String reversed;
	private int strLength;
	
	
	public StringChanger(String str) {
		original = str;
	}
	
	
	public String reverse() {
		reversed = "";
		strLength = original.length();
		
		while (strLength > 0) {
			reversed += original.charAt(strLength - 1);
			strLength--;
		}
		
		return reversed;
	}
}
