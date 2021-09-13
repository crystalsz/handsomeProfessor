import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double w,h,area,perimeter;
		
		System.out.println("높이를 입력하세요 : ");
		h = scn.nextDouble();
		System.out.println("넓이를 입력하세요 : ");
		w = scn.nextDouble();
		
		area = w * h;
		perimeter = 2.0 * (w + h);
		System.out.println("사각형의 면적은 = " + area + "입니다.");
		System.out.println("사각형의 둘레는 = " + perimeter + "입니다.");
	}

}

