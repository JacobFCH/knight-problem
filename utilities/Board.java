package utilities;

public class Board {
	private int height;
	private int width;
	private int[] goal;
	private int[] start;
	
	public boolean[][] binaryMap;
	
	public void setBoardDim(int h, int w) {
		height = h;
		width = w;
	}
	
	public int[] getBoardDim() {
		int[] d = {height, width};
		return d;
	}
	
	public void setStart(int[] s) {
		start = s;
	}
	
	public  int[] getStart() {
		return start;
	}
	
	public void setGoal(int[] g) {
		goal = g;
	}
	
	public  int[] getGoal() {
		return goal;
	}
	
	public void initBoard() {
		binaryMap = new boolean[height][width];
	}
	
	public boolean isLegal(int[] position) {
		
		if (position[0] < 0 || position[0] > height) {
			return false;
		}
		else if (position[1] < 0 || position[1] > width) {
			return false;
		}
		else if (binaryMap[position[0]][position[1]]) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
