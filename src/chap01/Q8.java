package chap01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합 구하기");
		System.out.println("n의 값 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		sum = (n+1) * (n/2) + (n%2==1 ? (n+1)/2 : 0); // n이 홀수 일때 처리
		
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		sc.close();
		}
		

}

