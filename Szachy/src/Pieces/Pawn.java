package Pieces;

public class Pawn extends Piece{

	Pawn(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean isMoveValid(int x, int y) {
		if(y == _y+1) {
			if(x == _x || x == _x+1 || x == _x-1) {
				return true;
			}
			return false;
		}
		else return false;
	}

	@Override
	public boolean isPathValid(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PieceType getType() {
		return PieceType.PAWN;
	}
}
