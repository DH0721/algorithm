package chap01;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ �� ���ϱ�");
		System.out.println("n�� �� �Է� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum +=i;
		
		}

		System.out.println("1���� " + n + "������ �� : " + sum);
		sc.close();

	}

}
