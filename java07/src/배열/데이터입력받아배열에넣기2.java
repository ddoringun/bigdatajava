package 배열;

import java.util.Scanner;

public class 데이터입력받아배열에넣기2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int num[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자 입력 : ");
			num[i] = sc.nextInt();
		}
		for (int i : num) {
			System.out.println(i);
		}
		
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
		
	}

}
