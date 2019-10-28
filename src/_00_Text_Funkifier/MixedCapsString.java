package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newString = s;
		String firstPart;
		String secondPart = "";
		String character;
		String newCharacter;
		for (int i = 0; i < newString.length() - 1; i++) {
			if (i != 0) {
				if (i % 2 == 1) {
					firstPart = newString.substring(0, i);
					if (i != newString.length() - 1) {
						character = newString.substring(i, i + 1);
						secondPart = newString.substring(i + 1, newString.length());
						newCharacter = character.toUpperCase();
						newString = firstPart + newCharacter + secondPart;
					}
				} else if (i % 2 == 0) {
					firstPart = newString.substring(0, i);
					if (i != newString.length() - 1) {
						secondPart = newString.substring(i + 1, newString.length());
						character = newString.substring(i, i + 1);
						newCharacter = character.toLowerCase();
						newString = firstPart + newCharacter + secondPart;
					}
				}
			} else {
				secondPart = newString.substring(1, newString.length());
				character = newString.substring(0, 1);
				newCharacter = character.toLowerCase();
				newString = newCharacter + secondPart;
			}

		}
		return newString;
	}

}
