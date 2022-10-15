
public class Map {
	private char [][] mapArray;
	private int mapSize;
	private int keyX;
	private int keyY;
	
	
	public Map(int mapSize) {
		if(mapSize < 10 && mapSize > 0) {
			this.mapSize = mapSize;
			this.mapArray = new char[mapSize][mapSize];
			for(int i = 0; i < mapSize; i++) {
				for(int j = 0; j < mapSize; j++) {
					this.mapArray[j][i] = 'X';
				}
			}
			this.keyX = Utils.generateRandomInteger(mapSize);
			this.keyY = Utils.generateRandomInteger(mapSize);
		}
		else {
			System.err.println("Please restart the game");
		}
	}
	
	public void printMapArray() {
		for(int i = 0; i < mapSize; i++) {
			for(int j = 0; j < mapSize; j++) {
				System.out.print(this.mapArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean shine(Coordinate[] coordinates) {
		for(Coordinate coordinate : coordinates) {
			if(coordinate.getX() == this.keyX && coordinate.getY() == this.keyY) {
				return true;
			}
			else if(coordinate.getX() < this.mapSize && coordinate.getY() < this.mapSize){
				this.mapArray[coordinate.getX()][coordinate.getY()] = 'O';
			}
			else {
				System.out.println("Wrong coordinate but it's ok");
			}
		}
		return false;
	}
}
