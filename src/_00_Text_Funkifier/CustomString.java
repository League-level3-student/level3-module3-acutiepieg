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
		for (int i = s.length(); i > secondPart.length() - 1; i--) {
			newSecondPart = newSecondPart + secondPart.charAt(i);
		}
		for (int i = 0; i < firstPart.length() - 1; i++) {
			finalString = finalString + firstPart.charAt(i);
			if (i < s.length()) {
				finalString = finalString + secondPart.charAt(i);
			}
		}

		return finalString;
	}
}
