package chap03;

import java.util.Scanner;

public class Q1 {
	// �迭 a�� ���� n�� ��ҿ��� key�� ���� ��Ҹ� ���� �˻�(���ʹ�)
	static int seqSearchSen(int[] a, int n, int key) {
		int i;

		a[n] = key; // ���ʸ� �߰�

		for (i = 0; a[i] != key; i++)
			;
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; // ��ڼ� num + 1�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		
		sc.close();
	}

}
