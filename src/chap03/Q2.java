package chap03;

import java.util.Scanner;

public class Q2 {
	// �迭 a�� ���� n�� ��ҿ��� key�� ���� ��Ҹ� ���� �˻� (���ʹ�)
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		// ��� ���뼱
		System.out.print("---+");
		for (int k = 0; k < 4 * n + 3 ; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // �˻�����
		}
		return -1; // �˻�����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = sc.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = sc.nextInt();

		int idx = seqSearchEx(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� " + "x[" + idx + "]�� �ֽ��ϴ�.");
		
		sc.close();
	}
}
