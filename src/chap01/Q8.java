package chap01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ �� ���ϱ�");
		System.out.println("n�� �� �Է� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		sum = (n+1) * (n/2) + (n%2==1 ? (n+1)/2 : 0); // n�� Ȧ�� �϶� ó��
		
		System.out.println("1���� " + n + "������ �� : " + sum);
		sc.close();
		}
		

}

