package chap01;

import java.util.Scanner;
// 4개 값 중 최댓값을 구하기

public class Q1 {
	static int max4(int a, int b, int c, int d) {
		int max = a; 	//최댓값
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 입력：");
		a = stdIn.nextInt();
		System.out.print("b의 값 입력：");
		b = stdIn.nextInt();
		System.out.print("c의 값 입력：");
		c = stdIn.nextInt();
		System.out.print("d의 값 입력：");
		d = stdIn.nextInt();

		int max = max4(a, b, c, d); 	// a, b, c, d의 최댓값

		System.out.println("최댓값 :  " + max + " 입니다.");
		stdIn.close();
	}
}
