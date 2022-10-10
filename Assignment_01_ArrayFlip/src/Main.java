
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		printOriginalArray(array);
		arrayFlip1(array);
		arrayFlip2(array);

	}
	
	private static void printOriginalArray(int[][] array) {
		System.out.println("Original Array:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void arrayFlip1(int[][] array) {
		System.out.println("\nflip 1:");
		for(int i = 2; i >= 0; i--) {
			for(int j = 2; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void arrayFlip2(int[][] array) {
		System.out.println("\nflip 2:");
		for(int j = 0; j < 3; j++) {
			for(int i = 2; i >= 0; i--) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	


}
