package PracticeProgram;

public class EvenOddNumbers {
	
	
	public static String evenOdd(int a) {
		return a % 2 == 0 ? "even" : "odd";
	}
	public static void main(String[] args) {

		int a = 11;

		System.out.println(evenOdd(a));
	}
}
