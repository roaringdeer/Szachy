package Pieces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Board.Board;
import Board.Move;
import Board.Tile;
import Player.ChessColor;

public class Knight extends Piece{

	private final static int[] POSSIBLE_MOVES = {-17, -15, -10, -6, 6, 10, 15, 17};
	
	Knight(int position, ChessColor color) {
		super(position, color);
	}

	@Override
	public List<Move> calculateLegalMoves(Board board) {
		int destinationCoordinate;
		final List<Move> legalMoves = new ArrayList<>();
		for(final int current : POSSIBLE_MOVES) {
			destinationCoordinate = _position + current;
			if(true /*isValidTileCoordinate*/) {
				final Tile destinationTile = board.getTile(destinationCoordinate);
				if(!destinationTile.isOccupied()) {
					legalMoves.add(new Move());
				}
				else {
					final Piece pieceAtDestination = destinationTile.getPiece();
					final ChessColor pieceColor = pieceAtDestination.getPieceColor();
					
					if(_color != pieceColor) {
						legalMoves.add(new Move());
					}
				}
			}
		}
		
		return Collections.unmodifiableList(legalMoves);
	}

}
