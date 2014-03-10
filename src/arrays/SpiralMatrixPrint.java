package arrays;

public class SpiralMatrixPrint {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }, };

		int rowStartIndex = 0;
		int columnStartIndex = 0;
		int rowEndIndex = a.length - 1;
		int colEndIndex = a[0].length - 1;
		int i;

		while (rowStartIndex < rowEndIndex && columnStartIndex < colEndIndex) {

			for (i = columnStartIndex; i < colEndIndex; i++) {
				System.out.println(a[rowStartIndex][i]);
			}
			rowStartIndex++;

			for (i = rowStartIndex; i < rowEndIndex; i++) {
				System.out.println(a[i][colEndIndex - 1]);
			}
			colEndIndex--;

			// Print the last row elements from the remaining rows
			if (rowStartIndex < rowEndIndex) {
				for (i = colEndIndex - 1; i >= columnStartIndex; i--) {
					System.out.println(a[rowEndIndex - 1][i]);
				}
				rowEndIndex--;
			}

			if (columnStartIndex < colEndIndex) {
				for (i = colEndIndex - 1; i >= rowStartIndex; --i) {
					System.out.println(a[i][columnStartIndex]);
				}
				columnStartIndex++;
			}
		}
	}
}
