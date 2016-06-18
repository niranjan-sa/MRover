import java.util.Scanner;


public class Plateau {
	static int [][]plateau;
	
	static int getMaxCol() {
		return plateau[0].length-1;
	}
	
	static int getMaxRow() {
		return plateau.length;
	}
	
	public static void main(String[] args) {
		int row, cols;
		Scanner sc=new Scanner(System.in);
		//Read the size of plateau
		row=sc.nextInt();
		cols=sc.nextInt();
		//create a plateau Actually I got this 2D array is unnecessary will remove it
		plateau=new int[row+1][cols+1];
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
