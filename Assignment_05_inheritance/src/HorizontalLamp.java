
public class HorizontalLamp extends Lamp{
	public HorizontalLamp() {
		super.setStock(Utils.limitForEachLamp());
	}

	@Override
	public Coordinate[] shineCoordinates(Coordinate coordinate) {
		super.setStock(this.getStock() -1);
		Coordinate [] coordinates = {coordinate, new Coordinate(coordinate.getX() + 1, coordinate.getY())};
		return coordinates;	
	}

	public int getStock() {
		return super.getStock();
	}
}
