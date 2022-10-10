import java.util.Scanner;

public class Main {



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringHolder stringHolder = new StringHolder(str);
		System.out.println(stringHolder.changeString());
		
	

		
	}

}
