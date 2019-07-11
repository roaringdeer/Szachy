package Board;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Pieces.Piece;

public abstract class Tile {
	protected final int _tileCoordinate;
	
	private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();
	
	private Tile(int tileCoordinate){
		_tileCoordinate = tileCoordinate;
	}
	
	private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
		final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
		for(int i = 0; i<64; i++) {
			emptyTileMap.put(i, new EmptyTile(i));
		}
		return Collections.unmodifiableMap(emptyTileMap);
	}

	public static Tile createTile(final int tileCoordinate, final Piece piece) {
		return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILES_CACHE.get(tileCoordinate);
	}
	public abstract boolean isOccupied();
	
	public abstract Piece getPiece();
	
	public static final class EmptyTile extends Tile{

		EmptyTile(final int tileCoordinate) {
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
	}
	public static final class OccupiedTile extends Tile{
		private final Piece _piece;
		
		OccupiedTile(final int tileCoordinate, final Piece piece){
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
