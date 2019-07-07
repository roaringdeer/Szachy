package Pieces;

public class Rook extends Piece{

	Rook(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean isMoveValid(int x, int y) {
		if(x == _x && y != _y) return true;
		if(y == _y && x != _x) return true;
		else return false;
	}

	@Override
	public boolean isPathValid(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PieceType getType() {
		return PieceType.ROOK;
	}
}
