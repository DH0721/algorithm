package chap01;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0;
		for (int i = min; i <= max; i++)
			sum += i;
		return (sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 a,b포함 합 구하기");
		System.out.println("a값 입력 : ");
		int a = sc.nextInt();
		System.out.println("b값 입력 : ");
		int b = sc.nextInt();

		System.out.println("a부터 b까지의 합 : " + sumof(a,b));
		sc.close();
	}
}
