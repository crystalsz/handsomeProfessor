import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		
		System.out.println("정수 입력 : ");
		num = scn.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		}
		else {
			System.out.println(num + "은 홀수 입니다.");
		}

	}

}
