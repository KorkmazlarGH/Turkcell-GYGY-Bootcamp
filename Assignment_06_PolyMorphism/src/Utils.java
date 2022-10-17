import java.util.Scanner;

public class Utils {
	
	public static ADivisibleInteger scanf() {
		ADivisibleInteger returnValue = null; 
		System.out.print("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		//scanner.close();
		if(number % 6 == 0)
			returnValue = new MultipleOfSix(number);
		else if(number % 3 == 0)
			returnValue = new MultipleOfThree(number);
		else if(number % 2 == 0)
			returnValue = new MultipleOfTwo(number);
		return returnValue;
	}
	
	
}
