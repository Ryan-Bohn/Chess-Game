
public class ChessPiece {
	
	boolean hasPiece;
	int team;
	String abbreviation;
	Coordinate location;
	
	ChessPiece(int x, int y) {
		
		hasPiece = false;
		team = 0;
		abbreviation = "";
		location = new Coordinate(x, y);
		
	}
	
	ChessPiece() {
		
	}
	
}