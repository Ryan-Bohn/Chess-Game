
public class King extends ChessPiece {
	
	King(int team, int x, int y) {
		
		hasPiece = true;
		this.team = team;
		abbreviation = "K";
		location = new Coordinate(x, y);
		
	}
	
	boolean move(int horizontal, int vertical) {
		
		if (location.x + horizontal >= 0 && location.x + horizontal <= 7 && location.y + vertical >= 0 && location.y + vertical <= 7) {
			location.x += horizontal;
			location.y += vertical;
			return true;
		} else {
			return false;
		}
		
	}
	
}
