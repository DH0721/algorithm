package chap01;

import java.util.Scanner;

public class Q11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �������� �ڸ����� ���մϴ�.");

		int n;
		do {
			System.out.print("��������");
			n = sc.nextInt();
		} while (n < 0);

		int cc = 0; 			// �ڸ���
		while (n > 0) {
			n = n / 10; 			// n / 10
			cc++;
		}

		System.out.println("�� ���� " + cc + "�ڸ��Դϴ�.");
		
		sc.close();
	}
}