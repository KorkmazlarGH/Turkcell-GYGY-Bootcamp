
public class Coordinate {
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		if(x >= 0 && y >= 0) {
			this.x = x;
			this.y = y;			
		}
		else {
			System.err.println(" Wrong coordinates! Restart the game");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
