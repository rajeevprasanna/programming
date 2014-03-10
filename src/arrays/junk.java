package arrays;

public class junk {
	public static void main(String[] args) {

		int[][] test = new int[4][];

		for (int i = 0; i < test.length; i++) {
			test[i] = new int[3];
			for (int j = 0; j < 3; j++) {
				test[i][j] = j;
			}
		}
		System.out.println("value of test array " + test[0][0]);
		System.out.println("value of test array " + test[0][1]);
		System.out.println("value of test array " + test[0][2]);
	}
}
