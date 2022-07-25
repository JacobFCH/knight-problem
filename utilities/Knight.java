package utilities;

public class Knight {
	private int x_pos;
	private int y_pos;
	private Object parent;
	
	public void setPosition(int x, int y) {
		x_pos = x;
		y_pos = y;
	}
	
	public int[] getPosition() {
		int[] position = {x_pos, y_pos};
		return position;
	}
	
	public void setParent(Object p) {
		parent = p;
	}
	
	public Object getParent() {
		return parent;
	}
	
	public int[][] generateNewKnightPositions() {
		int[] x = {1, 2, 2, 1, -1, -2, -2, -1};
		int[] y = {2, 1, -1, -2, -2, -1, 1, 2};
		int[][] newKnightsPositions = new int[8][2];
		
		for (int i = 0; i < 8; i++) {
			newKnightsPositions[i][0] = x_pos + x[i];
			newKnightsPositions[i][1] = y_pos + y[i];
		}
		
		return newKnightsPositions;
	}
	
}
