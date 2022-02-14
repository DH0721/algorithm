package chap2;

import java.util.Scanner;

public class Q5 {
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1]; // �迭b ��Ҹ� �迭a�� �������� ����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a�� ��ڼ��� ? ");
		int numa = sc.nextInt();
		int[] a = new int[numa];
		for(int i = 0; i<numa; i++) {
			System.out.print("a["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("b�� ��ڼ��� ? ");
		int numb = sc.nextInt();
		int[] b = new int[numb];
		for(int i = 0; i<numb; i++) {
			System.out.print("b["+ i +"] : ");
			b[i] = sc.nextInt();
		}
		
		rcopy(a, b); // �迭b�� ��� ��Ҹ� �迭a�� ���� copy

		System.out.println("�迭b�� ��� ��Ҹ� �迭a�� �������� ����.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		sc.close();

	}

}
