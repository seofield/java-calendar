package calender;

import java.util.Scanner;

public class calender {

	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public void printSampleCalender() {
		System.out.println("hello calender");
		System.out.println("월 화 수 목 금 토");
		System.out.println(" 1 2 3 4 5 6 7");
		System.out.println(" 1 2 3 4 5 6 7");
		System.out.println(" 1 2 3 4 5 6 7");
	   	System.out.println(" 1 2 3 4 5 6 7");
	}
	public static void main(String[] args) {
		
	
		String PROMPT = "cal>"; 
		Scanner scanner = new Scanner(System.in);
		calender cal = new calender();
		
		System.out.println("반복횟수를 입력하세요.");
		
		int repeat = scanner.nextInt();
		
		for(int i=0; i< repeat; i++) {
			System.out.println("달을 입력해주세요");
			System.out.print(PROMPT);

			int month = scanner.nextInt();			
			System.out.printf("%d월은 %d일까지 있습니다.\n",month, cal.getMaxDaysOfMonth(month));
		}
		System.out.println("bye~");		
				scanner.close();
	}
}
