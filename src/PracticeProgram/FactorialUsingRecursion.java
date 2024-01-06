package PracticeProgram;

public class FactorialUsingRecursion {


	public static int factNum(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factNum(num - 1);
		}

	}

	public static void main(String[] args) {

		int n = 5;

		int d = factNum(n);
		System.out.println(d);

	}

}
