package chap01;
import java.util.Scanner;
// 1, 2, ��, n�� ���� ���մϴ�(while�� ���� ���� i�� ���� Ȯ��).

public class Q6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ����");
		int n = stdIn.nextInt();

		int sum = 0; 		// ��
		int i = 1;

		while (i <= n) { 	// i�� n ���ϸ� �ݺ�
			sum += i; 		// sum�� i�� ����
			i++; 			// i�� ���� 1 ����(increment)
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		System.out.println("i�� �� : " + i + "��(��) �Ǿ����ϴ�.");
		
		stdIn.close();
	}
}
