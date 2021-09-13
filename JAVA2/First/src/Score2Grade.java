import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score,number;
		char grade;
		
		System.out.println("점수를 입력하세요.");
		score = scn.nextInt();
		
		number = score / 10;
		switch(number) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F'; break;
		}
		System.out.println(score + " 점은 " + grade + " 등급입니다.");

	}

}
