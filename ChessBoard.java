import java.awt.*;
import javax.swing.*;

public class ChessBoard {
	
	private JFrame boardFrame = new JFrame();
	private JPanel board = new JPanel();
	private JButton[][] squares = new JButton[8][8];
	private ChessPiece[][] pieces = new ChessPiece[8][8];
	int turn = 1;
	
	public ChessBoard() {
		
		boardFrame.add(board);
		boardFrame.setVisible(true);
		GridLayout grid = new GridLayout(0, 8);
		pieces[0][0] = new Rook(1);
		pieces[0][1] = new Knight(1);
		pieces[0][2] = new Bishop(1);
		pieces[0][3] = new Queen(1);
		
		
	}
	
	public void updateBoard() {
		
		
		
	}
	
}
