package chap2;

import java.util.Scanner;

public class Q4 {
	// �迭 b�� ��� ��Ҹ� �迭 a�� ����
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[i];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a�� ��ڼ��� ��");
		int numa = sc.nextInt(); // ��ڼ�
		int[] a = new int[numa]; // ��ڼ� numa�� �迭
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		System.out.print("b�� ��ڼ��� ��");
		int numb = sc.nextInt(); // ��ڼ�
		int[] b = new int[numb]; // ��ڼ� numb�� �迭
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}

		copy(a, b); // �迭 b�� ��� ��Ҹ� �迭 a�� �������� ����

		System.out.println("�迭b�� ��� ��Ҹ� �迭a�� ����.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]); //�迭a ���� Ȯ��
		
		sc.close();
	}
}
