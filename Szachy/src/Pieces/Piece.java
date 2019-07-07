package Pieces;

public abstract class Piece {
	protected int _x, _y;
	
	Piece(int x, int y){
		_x = x;
		_y = y;
	}
	
	public abstract boolean isPathValid(int x, int y);	//czy nie ma kolizji
	
	public abstract boolean isMoveValid(int x, int y);	//czy mo¿e wykonaæ ten ruch
	
	public void setCoordinateX(int x) {
		_x = x;
	}
	public void setCoordinateY(int y) {
		_y = y;
	}
	
	public int getCoordinateX() {
		return _x;
	}
	public int getCoordinateY() {
		return _y;
	}
	public abstract PieceType getType();
	
}
