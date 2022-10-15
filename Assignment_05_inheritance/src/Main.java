
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-- FIND THE KEY --");
		int mapSize = -1;
		mapSize = Utils.scanf(mapSize, "Enter the map size");
		Map map = new Map(mapSize);
		map.printMapArray();
		int chance = Utils.limitForEachLamp() * 3;
		int x = -1, y = -1;
		char lampType = 'e';
		VerticalLamp vl = new VerticalLamp();
		HorizontalLamp hl = new HorizontalLamp();
		CubicLamp cl = new CubicLamp();
		boolean isTheGameFinished = false;
		
		for(int turn = 0; turn < chance; turn++) {
			System.out.println("You have " + (chance - turn) + " more chance");
			x = Utils.scanf(x, "Please enter x value of upper leftmost point you want to shine\n");
			y = Utils.scanf(y, "Please enter y value of upper leftmost point you want to shine\n");
			lampType = Utils.scanf(lampType, "Please enter V for vertical lamp, H for horizontal map, C for cubic map\n");
			switch(lampType) {
			case 'V':
				if(vl.getStock()!=0) {
					isTheGameFinished = map.shine( vl.shineCoordinates(new Coordinate(x, y)) );
				}
				else {
					System.out.println("\nYou missed this time, Hah :)");
				}
				break;
			
			case 'H':
				if(hl.getStock()!=0) {
					isTheGameFinished = map.shine( hl.shineCoordinates(new Coordinate(x, y)) );
				}
				else {
					System.out.println("\nYou missed this time, Hah :)");
				}
				break;
			
			case 'C':
				if(cl.getStock()!=0) {
					isTheGameFinished = map.shine( cl.shineCoordinates(new Coordinate(x, y)) );
				}
				else {
					System.out.println("\nYou missed this time, Hah :)");
				}
				break;
			}
			if(isTheGameFinished) {
				System.out.println("You win");
				break;
			}
			map.printMapArray();
		}
		System.out.println("You lost the game");
	}

}
