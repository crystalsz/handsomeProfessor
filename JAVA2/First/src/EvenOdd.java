import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		
		System.out.println("���� �Է� : ");
		num = scn.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "�� ¦�� �Դϴ�.");
		}
		else {
			System.out.println(num + "�� Ȧ�� �Դϴ�.");
		}

	}

}
