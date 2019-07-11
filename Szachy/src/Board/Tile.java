package Board;
import Pieces.Piece;

public abstract class Tile {
	int _tileCoordinate;
	Tile(int tileCoordinate){
		_tileCoordinate = tileCoordinate;
	}
	
	public abstract boolean isOccupied();
	
	public abstract Piece getPiece();
	
	public static final class EmptyTile extends Tile{

		EmptyTile(int tileCoordinate) {
			super(tileCoordinate);
		}

		@Override
		public boolean isOccupied() {
			return false;
		}

		@Override
		public Piece getPiece() {
			return null;
		}
		
	public static final class OccupiedTile extends Tile{
		Piece _piece;
		
		OccupiedTile(int tileCoordinate, Piece piece){
			super(tileCoordinate);
			_piece = piece;
		}

		@Override
		public boolean isOccupied() {
			return true;
		}

		@Override
		public Piece getPiece() {
			return _piece;
		}
	}
		
	}
}
