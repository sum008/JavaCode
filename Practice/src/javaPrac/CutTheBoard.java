package javaPrac;

public class CutTheBoard {
	
	public static void cutTheBoard(int row, int column) {
		
		int maxPossibleSteps = (row-1)*(column-1);
		System.out.println(maxPossibleSteps);
	}

	public static void main(String[] args) {
		
		cutTheBoard(7,7);
	}

}
