
public class VerticalLamp extends Lamp{
	public VerticalLamp() {
		super.setStock(Utils.limitForEachLamp());
	}

	@Override
	public Coordinate[] shineCoordinates(Coordinate coordinate) {
		super.setStock(this.getStock() -1);
		Coordinate [] coordinates = {coordinate, new Coordinate(coordinate.getX(), coordinate.getY() + 1)};
		return coordinates;	
	}

	public int getStock() {
		return super.getStock();
	}
}
