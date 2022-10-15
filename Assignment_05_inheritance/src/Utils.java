import java.util.Scanner;

public class Utils {
	
	public static int scanf(int returnValue, String printText) {
		System.out.print(printText);
		Scanner scanner = new Scanner(System.in);
		returnValue = scanner.nextInt();
		//scanner.close();
		return returnValue;
	}
	
	public static char scanf(char returnValue, String printText) {
		System.out.print(printText);
		Scanner scanner = new Scanner(System.in);
		returnValue = (scanner.nextLine().charAt(0));
		//scanner.close();
		return returnValue;
	}
	
	public static int generateRandomInteger(int maxLimit) {
		return (int)(Math.random() * maxLimit);
	}
	
	public static int limitForEachLamp() {
		return 3;
	}
}
