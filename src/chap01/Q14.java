package chap01;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정사각형 모양으로 나타냅니다.");
		
		do {
			System.out.println("몇 단 삼각형?");
			n = sc.nextInt();
		} while(n<=0);
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {				
				System.out.print("*");
							
			}
			System.out.println();
		}
		sc.close();
	}
}
