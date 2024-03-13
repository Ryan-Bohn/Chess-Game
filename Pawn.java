
public class Pawn extends ChessPiece {
	
	Pawn(int team, int x, int y) {
		
		hasPiece = true;
		this.team = team;
		abbreviation = "P";
		location = new Coordinate(x, y);
		
	}
	
	boolean move(boolean taking, int direction, boolean enPassant) {
		
		int horizMove = taking ? direction : 0;
		int vertMove = (enPassant ? 2 : 1) * team;
		
		if (location.x + horizMove >= 0 && location.x + horizMove <= 7 && location.y + vertMove >= 0 && location.y + vertMove <= 7) {
			
			return true;
		} else {
			return false;
		}
		
	}
	
}
