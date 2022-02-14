package chap01;

import java.util.Scanner;

public class Q15 {
	
	// ���� �Ʒ��� ������ �̵�ﰢ���� ���
		static void triangleLB(int n) {
			for(int i = 1; i<=n; i++) {
				for(int j = 1; j<=n; j++) {
					if (i<j) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	// ������ ���� ������ �̵�ﰢ���� ���	
		static void triangleRU(int n) {
			for(int i = 1; i<=n; i++) {
				for(int j = 1; j<=n; j++) {
					if (i>j) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	// ���� ���� ������ �̵�ﰢ���� ���
		static void triangleLU(int n) {
			for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
				for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
					System.out.print('*');
				System.out.println(); 					
			}
		}
	// ������ �Ʒ��� ������ �̵�ﰢ���� ���
		static void triangleRB(int n) {
			for (int i = 1; i <= n; i++) { 				// 
				for (int j = 1; j <= n - i; j++) 		// n-i���� ' '�� ��Ÿ��
					System.out.print(' ');
				for (int j = 1; j <= i; j++) 			// i���� '*'�� ��Ÿ��
					System.out.print('*');
				System.out.println(); 					
			}
		}		

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n;

			System.out.println("�ﰢ�� ������� ��Ÿ���ϴ�.");

			do {
				System.out.print("�ܼ��� ��");
				n = sc.nextInt();
			} while (n <= 0);

			System.out.println("���� �Ʒ��� ������ �ﰢ��");
			triangleLB(n); // ���� �Ʒ��� ����
			
			System.out.println("������ ���� ������ �ﰢ��");
			triangleRU(n); // ������ ���� ����
					
			System.out.println("���� ���� ������ �ﰢ��");
			triangleLU(n); // ���� ���� ����
			
			System.out.println("������ �Ʒ��� ������ �ﰢ��");
			triangleRB(n); // ������ �Ʒ��� ����
			
			sc.close();
	}

}
