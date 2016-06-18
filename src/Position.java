
public class Position {
	private final int x, y;
	private final char direction;
	
	Position(int x, int y, char direction) {
		this.x=x;
		this.y=y;
		this.direction=direction;
	}
	
	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", direction=" + direction
				+ "]";
	}

	public char getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
