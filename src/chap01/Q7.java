package chap01;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합 구하기");
		System.out.println("n의 값 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum +=i;
		
		}

		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		sc.close();

	}

}
