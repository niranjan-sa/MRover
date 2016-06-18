
public class Rover {
	private Position pos;
	
	Rover(Position p) {
		//Initial Position
		pos=p;
	}
	
	//This is cool
	public void rotateLeft() {
		char newDirection=pos.getDirection();
		
			switch(pos.getDirection()) {
		
				case 'N':
					newDirection = 'W';
					break;
				
				case 'S':
					newDirection = 'E';
					break;
					
				case 'E':
					newDirection = 'N';
					break;
					
				case 'W':
					newDirection = 'S';
					break;
			}
		
		
		Position newPos=new Position(pos.getX(), pos.getY(), newDirection);
		setPos(newPos);
		
	}
	
	public void rotateright() {
		
		char newDirection=pos.getDirection();
		switch(pos.getDirection()) {
		case 'N':
			newDirection = 'E';
			break;
		
		case 'S':
			newDirection = 'W';
			break;
			
		case 'E':
			newDirection = 'S';
			break;
			
		case 'W':
			newDirection = 'N';
			break;
		}
		Position newPos=new Position(pos.getX(), pos.getY(), newDirection);
		setPos(newPos);
	}
	
	
	//Actual fun comes here
	public void move() {
		switch(pos.getDirection()) {
		case 'N':
			moveNorth();
			break;
		
		case 'S':
			moveSouth();
			break;
			
		case 'E':
			moveEast();
			break;
			
		case 'W':
			moveWest();
			break;
		}
	}
	
	
	private void moveWest() {	
		if(pos.getX()>0) {
			pos=new Position(pos.getX()-1, pos.getY(), pos.getDirection());
		}
	}

	private void moveEast() {
		if(pos.getX()<Plateau.getMaxCol()) {
			pos=new Position(pos.getX()+1, pos.getY(), pos.getDirection());
		}
	}

	private void moveSouth() {
		if(pos.getY()>0) {
			pos=new Position(pos.getX(), pos.getY()-1, pos.getDirection());
		}
	}

	private void moveNorth() {
		if(pos.getY()<Plateau.getMaxRow()) {
			pos=new Position(pos.getX(), pos.getY()+1, pos.getDirection());
		}
	}

	@Override
	public String toString() {
		return "Rover [pos=" + pos + "]";
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
}
