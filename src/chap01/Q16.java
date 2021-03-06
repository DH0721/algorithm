package chap01;

import java.util.Scanner;

public class Q16 {
	
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print('4');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("피라미드 모양으로 나타냅니다.");

		do {
			System.out.print("단수는 ：");
			n = sc.nextInt();
		} while (n <= 0);

		spira(n); 		
		
		sc.close();
	}
}
