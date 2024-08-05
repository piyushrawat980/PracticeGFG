package interviewPrep;

public class Solution2 
{

	    public int largestMagicSquare(int[][] A) {
	    int rows = A.length;
	    int columns = A[0].length;

	        // Calculate row sums
	        int[][] rowSums = new int[rows][columns + 1];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                rowSums[i][j + 1] = rowSums[i][j] + A[i][j];
	            }
	        }

	        // Calculate column sums
	        int[][] columnSums = new int[rows + 1][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                columnSums[i + 1][j] = columnSums[i][j] + A[i][j];
	            }
	        }

	        int maxSize = Math.min(rows, columns);  // Maximum possible size of magic square
	        int maxMagicSize = 1;  // Default value

	        // Check each possible size of the magic square
	        for (int size = 2; size <= maxSize; size++) {
	            for (int i = 0; i <= rows - size; i++) {
	                for (int j = 0; j <= columns - size; j++) {
	                    if (isMagicSquare(A, rowSums, columnSums, i, j, size)) {
	                        maxMagicSize = size;
	                    }
	                }
	            }
	        }

	        return maxMagicSize;
	    }

		    	private boolean isMagicSquare(int[][] A, int[][] rowSums, int[][] columnSums, int startRow, int startColumn, int size) {
		        int targetSum = rowSums[startRow][startColumn + size] - rowSums[startRow][startColumn];
		        int diagonalSum1 = 0;
		        int diagonalSum2 = 0;

		        for (int i = 0; i < size; i++) {
		            if (rowSums[startRow + i][startColumn + size] - rowSums[startRow + i][startColumn] != targetSum) {
		                return false;
		            }
		            if (columnSums[startRow + size][startColumn + i] - columnSums[startRow][startColumn + i] != targetSum) {
		                return false;
		            }
		            diagonalSum1 += A[startRow + i][startColumn + i];
		            diagonalSum2 += A[startRow + i][startColumn + size - i - 1];
		        }

		        return diagonalSum1 == targetSum && diagonalSum2 == targetSum;
		    }

		    public static void main(String[] args) {
		        Solution2 solution = new Solution2();

		        // Example usage
		        int[][] matrix = {
		            {4, 3, 4, 5, 3},
		            {2, 7, 3, 8, 4},
		            {1, 7, 6, 5, 2},
		            {8, 4, 9, 5, 5}
		        };

		        int largestSize = solution.largestMagicSquare(matrix);
		        System.out.println("Largest Magic Square Size: " + largestSize);
		    }
}