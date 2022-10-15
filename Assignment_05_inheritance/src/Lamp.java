
public abstract class Lamp {
	
	private int stock;
	
	public abstract Coordinate[] shineCoordinates(Coordinate coordinate);
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

}
