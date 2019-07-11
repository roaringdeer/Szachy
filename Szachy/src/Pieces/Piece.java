package Pieces;

import Player.ChessColor;
import java.util.List;
import Board.*;

public abstract class Piece {
	
	protected final int _position;
	protected final ChessColor _color;
	
	Piece(int position, ChessColor color){
		_position = position;
		_color = color;
	}
	
	public ChessColor getPieceColor(){
		return _color;
	}
	
	public abstract List<Move> calculateLegalMoves(final Board board);
	
}
