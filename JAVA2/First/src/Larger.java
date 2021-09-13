import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x,y,max;
		
		System.out.println("숫자를 입력하세요 : ");
		x = scn.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		y = scn.nextInt();
		
		if(x > y) {
			max = x;
		}
		else {
			max = y;
		}
		System.out.println("더 큰 수는 " + max + " 입니다.");
	}

}