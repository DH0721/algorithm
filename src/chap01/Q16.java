package chap01;

import java.util.Scanner;

public class Q16 {
	
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print('4');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 						
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("�Ƕ�̵� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��� ��");
			n = sc.nextInt();
		} while (n <= 0);

		spira(n); 		
		
		sc.close();
	}
}