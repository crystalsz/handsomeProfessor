import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x,y,max;
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		x = scn.nextInt();
		System.out.println("���ڸ� �Է��ϼ��� : ");
		y = scn.nextInt();
		
		if(x > y) {
			max = x;
		}
		else {
			max = y;
		}
		System.out.println("�� ū ���� " + max + " �Դϴ�.");
	}

}