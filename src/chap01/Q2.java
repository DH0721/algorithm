package chap01;

import java.util.Scanner;
// 4개 값 중 최솟값을 구하기

public class Q2 {
	static int min4(int a, int b, int c) {
		int min = a; 	//최솟값
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c;

		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 입력：");
		a = stdIn.nextInt();
		System.out.print("b의 값 입력：");
		b = stdIn.nextInt();
		System.out.print("c의 값 입력：");
		c = stdIn.nextInt();

		int min = min4(a, b, c); 	// a, b, c, d의 최솟값

		System.out.println("최솟값 :  " + min + " 입니다.");
		stdIn.close();
	}
}
