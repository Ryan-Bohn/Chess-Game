
public class Bishop extends ChessPiece {
	
	Bishop(int team, int x, int y) {
		
		hasPiece = true;
		this.team = team;
		abbreviation = "B";
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
