package chap01;

import java.util.Scanner;

public class Q11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정수값：");
			n = sc.nextInt();
		} while (n < 0);

		int cc = 0; 			// 자릿수
		while (n > 0) {
			n = n / 10; 			// n / 10
			cc++;
		}

		System.out.println("그 수는 " + cc + "자리입니다.");
		
		sc.close();
	}
}