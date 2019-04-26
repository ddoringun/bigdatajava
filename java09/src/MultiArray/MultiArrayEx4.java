package MultiArray;

import java.util.Scanner;

public class MultiArrayEx4 {

	public static void main(String[] args) {
		int[][] seat = new int[3][10];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---------------------------------");
			System.out.print("   ");
			for (int i = 1; i < 11; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("---------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.print("종료 0, 예약 1 >>");
			int end = sc.nextInt();
			if(end == 0) {
				System.out.println("시스템 종료");
				break;
			}else {
				System.out.print("행 선택  (1 ~ 3) : ");
				int row = sc.nextInt();
				System.out.println("열 선택  (1 ~ 10) : ");
				int col = sc.nextInt();
				
				//예약 가능하면, 예약 처리
				if(seat[row-1][col-1] == 0) {
					seat[row-1][col-1] = 1; 
				//예약이 되었는지 확인
					System.out.println("예약 완료!");
				//예약 불가능하면, 재입력요구
				}else {
					System.out.println("예약이 이미 완료된 자리입니다.");
					System.out.println("다시 선택해주세요!");
				}
				
				
			}
		}	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
	}
}
