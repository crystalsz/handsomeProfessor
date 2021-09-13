import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month, days, year;
		
		System.out.println("년도를 입력하세요 : ");
		year = scn.nextInt();
		System.out.println("달을 입력하세요 : ");
		month = scn.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30; break;
		case 2:
			//윤년인지 아닌지 판단
			if(year%4==0 && year%100!=0 || year%400==0) {
				days = 29;
			}else {
				days = 28;
			}
			days = 28; break;
		default:
			days = 31; break;
		}
		System.out.println(year + "년 " + month + "월은 " + days + "일이 마지막 날 입니다.");
	}

}
