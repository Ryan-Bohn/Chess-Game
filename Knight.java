public class Knight extends ChessPiece {

	Knight(int team, int x, int y) {

		hasPiece = true;
		this.team = team;
		abbreviation = "H";
		location = new Coordinate(x, y);

	}

	boolean move(int horizontal, int vertical, boolean horizFirst) {

		int horizMove = horizFirst ? 2 * horizontal : horizontal;
		int vertMove = horizFirst ? vertical : 2 * vertical;

		if (location.x + horizMove >= 0 && location.x + horizMove <= 7 && location.y + vertMove >= 0&& location.y + vertMove <= 7) {
			location.x += horizMove;
			location.y += vertMove;
			return true;
		} else {
			return false;
		}

	}

}
