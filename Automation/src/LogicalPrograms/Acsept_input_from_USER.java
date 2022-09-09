package LogicalPrograms;

import java.util.Scanner;

public class Acsept_input_from_USER {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter input1:");
		int num1 = sc.nextInt();

		System.out.println("enter input2:");
		int num2 = sc.nextInt();

		System.out.println(num1 + num2);
	}
}
