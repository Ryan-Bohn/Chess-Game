public class Rook extends ChessPiece {
	
	Rook(int team, int x, int y) {
		
		abbreviation = "R";
		hasPiece = true;
		this.team = team;
		location = new Coordinate(x, y);
		
	}
	
	boolean move(int horizontal, int vertical, int distance) {
		
		if (location.x + horizontal * distance >= 0 && location.x + horizontal * distance <= 7 && location.y + vertical * distance >= 0 && location.y + vertical * distance <= 7) {
			location.x += horizontal * distance;
			location.y += vertical * distance;
			return true;
		} else {
			return false;
		}
		
	}
	
}