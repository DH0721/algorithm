package chap2;

import java.util.Scanner;

public class Q2 {
	// 배열의 요소 a[idx1]와 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열 a의 요소 값
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		print(a);
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1);
			print(a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수는 ：");
		int num = sc.nextInt(); // 요솟수

		int[] x = new int[num]; // 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		reverse(x); // 배열 a의 요소를 역순으로 정렬

		System.out.println("역순 정렬을 마쳤습니다.");
		sc.close();
	}
}
