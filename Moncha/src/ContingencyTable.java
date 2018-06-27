import java.util.*;

public class ContingencyTable {

		public static void readData(int[][] table, int numRows, int numCols){
			//the function of this method reads data for a table row by row
			//if the table has numRows as rows and numCols as columns.
			
			System.out.println("Enter the data of the 2D Array, row by row");
			Scanner input = new Scanner(System.in);
			
			//read data, row by row
			for (int row = 0; row < numRows; row++) {
				for (int col = 0; col < numCols; col++) {
					table[row][col] = input.nextInt();
				}
			
		}
			
		public static void display(int[][] table, int numRows, int numCols, int[] rowSums, int[] colSums) {
			
		}

	}

}
