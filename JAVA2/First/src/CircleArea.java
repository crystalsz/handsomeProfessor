import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double area, radius;
		
		System.out.println("반지름을 입력하세요 : ");
		radius = scn.nextDouble();
		area = 3.141592 * radius * radius;
		
		System.out.println(area);
		
		
		

	}

}

