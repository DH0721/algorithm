package chap01;

import java.util.Scanner;

public class Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a; 	//�ּڰ�
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("�� ������ �ּڰ��� ���մϴ�.");
		System.out.print("a�� �� �Է£�");
		a = stdIn.nextInt();
		System.out.print("b�� �� �Է£�");
		b = stdIn.nextInt();
		System.out.print("c�� �� �Է£�");
		c = stdIn.nextInt();
		System.out.print("d�� �� �Է£�");
		d = stdIn.nextInt();

		int min = min4(a, b, c, d); 	// a, b, c, d�� �ּڰ�

		System.out.println("�ּڰ� :  " + min + " �Դϴ�.");
		stdIn.close();
	}
}

