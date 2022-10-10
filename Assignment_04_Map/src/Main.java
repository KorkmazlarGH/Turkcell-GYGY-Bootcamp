import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		fillTheMap(str, map);
		printMapKeys(map);
		printMapKeysAndValues(map);
	}
	
	private static void fillTheMap(String text, Map<Character, Integer> map) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(map.containsKey(letter)) {
				map.put(letter, ((int) map.get(letter)) + 1);
			}
			else {
				map.put(letter, 1);
			}
		}
	}

	private static void printMapKeys(Map<Character, Integer> map) {
		System.out.println("\nOnly the letters: ");
		for(char chr : map.keySet()) {
			if(chr != ' ')
				System.out.print(chr);
		}
	}
	
	
	private static void printMapKeysAndValues(Map<Character, Integer> map) {
		System.out.println("\n\nLetters and their occurance: ");
		for(char chr : map.keySet()) {
			if(chr == ' ')
				System.out.print(" ");
			else
				System.out.print(chr + "" + map.get(chr));
		}
	}
}
