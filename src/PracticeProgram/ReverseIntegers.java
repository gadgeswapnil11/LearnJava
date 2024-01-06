package PracticeProgram;

import java.util.Scanner;

public class ReverseIntegers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value here");

		int a = sc.nextInt();

		int reverse = 0;

		while (a != 0) {

			int digit = a % 10;
			System.out.println("digi sepration=  "+digit);
			reverse = reverse*10+digit;
			System.out.println("Reverse=  "+reverse);

			a=a/10;
			System.out.println("a length=  "+a);

		}
		
		System.out.println("Reverse Number=  "+reverse);
	}

}
