package chap2;

import java.util.Scanner;

public class Q11 {

	int y; // ���� ��
	int m; // ��(1~12)
	int d; // ��(1~31)

	// �� ���� �ϼ�
	static int[][] mdays = { 
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
	};

	// ���� year���� �����ΰ�? (���⣺1����⣺0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// ������(�־��� ��¥�� ����)
	Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	// n�� ���� ��¥�� ��ȯ
	Q11 after(int n) {
		Q11 temp = new Q11(this.y, this.m, this.d);
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}

	// n�� ���� ��¥�� ��ȯ
	Q11 before(int n) {
		Q11 temp = new Q11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��¥�� �Է��ϼ���.\n");
		System.out.print("�⣺");
		int y = sc.nextInt();
		System.out.print("����");
		int m = sc.nextInt();
		System.out.print("�ϣ�");
		int d = sc.nextInt();
		Q11 date = new Q11(y, m, d);

		System.out.print("�� �� ��/���� ��¥�� ���ұ��?��");
		int n = sc.nextInt();

		Q11 d1 = date.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.y, d1.m, d1.d);

		Q11 d2 = date.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d2.y, d2.m, d2.d);
		
		sc.close();
	}

}