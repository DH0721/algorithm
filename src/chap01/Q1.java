package chap01;

import java.util.Scanner;
// 4�� �� �� �ִ��� ���ϱ�

public class Q1 {
	static int max4(int a, int b, int c, int d) {
		int max = a; 	//�ִ�
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

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� �Է£�");
		a = stdIn.nextInt();
		System.out.print("b�� �� �Է£�");
		b = stdIn.nextInt();
		System.out.print("c�� �� �Է£�");
		c = stdIn.nextInt();
		System.out.print("d�� �� �Է£�");
		d = stdIn.nextInt();

		int max = max4(a, b, c, d); 	// a, b, c, d�� �ִ�

		System.out.println("�ִ� :  " + max + " �Դϴ�.");
		stdIn.close();
	}
}
