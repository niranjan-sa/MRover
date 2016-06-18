import java.util.Scanner;


public class Plateau {
	static int rows, col;
	
	static int getMaxCol() {
		return col;
	}
	
	static int getMaxRow() {
		return rows+1;
	}
	
	public static void main(String[] args) {
		int row, cols;
		Scanner sc=new Scanner(System.in);
		//Read the size of plateau
		row=sc.nextInt();
		cols=sc.nextInt();
		
		rows=row;
		col=cols;
		//create a plateau Actually I got this 2D array is unnecessary will remove it
		sc.nextLine();
		//First Rover
		String initPos[]=sc.nextLine().split(" ");
		int x=Integer.parseInt(initPos[0]);
		int y=Integer.parseInt(initPos[1]);
		char d=initPos[2].charAt(0);
		
		Rover rov1=new Rover(new Position(x, y, d));
		
		//Commands
		String cmds=sc.nextLine();
		char[] cmd=cmds.toCharArray();
		
		//Process the commands one by one
		for(char c : cmd) {
			if(c=='L') {
				rov1.rotateLeft();
			} else if(c=='R') {
				rov1.rotateright();
			} else {
				rov1.move();
			}
		}
		
		//Print the location
		System.out.println(rov1);
	}
	
	public static int convert(int colIndex) {
		return getMaxCol()-colIndex;
	}

}
