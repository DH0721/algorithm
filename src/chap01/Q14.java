package chap01;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("���簢�� ������� ��Ÿ���ϴ�.");
		
		do {
			System.out.println("�� �� �ﰢ��?");
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