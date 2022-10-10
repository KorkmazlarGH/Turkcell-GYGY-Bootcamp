
public class StringHolder {
	
	
	private enum upperVowels{
		A,
		E,
		I,
		İ,
		O,
		Ö,
		U,
		Ü
	}
	
	private enum lowerVowels{
		a,
		e,
		ı,
		i,
		o,
		ö,
		u,
		ü
	}

	
	private String str;
	
	private boolean isInUpperVowels(String strChar) {
		for(upperVowels vowel : upperVowels.values()) {
			if(strChar.equals(vowel.name())) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isInLowerVowels(String strChar) {
		for(lowerVowels vowel : lowerVowels.values()) {
			if(strChar.equals(vowel.name())) {
				return true;
			}
		}
		return false;
	}
	
	
	public StringHolder(String str) {
		this.str = str;
	}
	
	public String changeString() {
		String returnValue = "";
		String strTemp = "";
		for(int index = 0; index < str.length(); index++) {
			strTemp = "" + str.charAt(index);
			if(isInUpperVowels(strTemp)) {
				returnValue += 1 + upperVowels.valueOf(String.valueOf(str.charAt(index))).ordinal();
			}
			else if(isInLowerVowels(strTemp)) {
				returnValue += 1 + lowerVowels.valueOf(String.valueOf(str.charAt(index))).ordinal();
			}
			else {
				returnValue += strTemp;
			}
		}
		return returnValue;
	}
}
