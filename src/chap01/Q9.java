package chap01;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
		int min; // a, b�� ���� ���� ��
		int max; // a, b�� ū ���� ��

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0;
		for (int i = min; i <= max; i++)
			sum += i;
		return (sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a���� b������ a,b���� �� ���ϱ�");
		System.out.println("a�� �Է� : ");
		int a = sc.nextInt();
		System.out.println("b�� �Է� : ");
		int b = sc.nextInt();

		System.out.println("a���� b������ �� : " + sumof(a,b));
		sc.close();
	}
}
