package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String firstPart = s.substring(0, s.length() / 2);
		String secondPart = s.substring(s.length() / 2, s.length());
		String newSecondPart = "";
		String finalString = "";
		for (int i = secondPart.length(); i > secondPart.length() - 1; i--) {
			if (i < secondPart.length()) {
			newSecondPart = newSecondPart + secondPart.charAt(i);
			}
		}        
		finalString = firstPart + newSecondPart;
		return finalString;
	}
}
