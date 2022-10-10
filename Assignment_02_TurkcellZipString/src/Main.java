import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(zip(str));
	}
	
	private static int letterRepeatAmount(String str, int index) {
		int repeat = 0, iter = index + 1;
		char checkLetter = str.charAt(index);
		while(iter < str.length() && str.charAt(iter) == checkLetter) {
			iter += 1;
		}
		return iter - index;
	}
	
	private static String zip(String str) {
		int iter = 0, repeatAmount = 0;
		StringBuffer stringBuffer = new StringBuffer("");
		while(iter < str.length()) {
			if(str.charAt(iter) == ' ') {
				stringBuffer.append(' ');
				iter += 1;
			}
			else {
				stringBuffer.append(str.charAt(iter));
				repeatAmount = letterRepeatAmount(str, iter);
				stringBuffer.append(repeatAmount);
				iter += repeatAmount;	
			}
		}
		return stringBuffer.toString();
	}
}
