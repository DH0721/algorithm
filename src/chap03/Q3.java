package chap03;

import java.util.Scanner;

public class Q3 {
	static int searchidx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i = 0; i < n; i++)
			if(a[i] == key)
				idx[count++] = i;
		
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수：");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요솟수 num인 배열
		int[] y = new int[num]; // 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sc.nextInt();
		}
		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = sc.nextInt();

		int count = searchidx(x, num, ky, y);

		if (count == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			for (int i = 0; i < count; i++)
				System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
		
			int sum = 0;
			for(int i = 0; i < count; i++) {
				sum ++;
			}
		System.out.println("찾는 요솟수 발견 갯수 : " + sum + " 입니다.");
		
		sc.close();
	}

}
