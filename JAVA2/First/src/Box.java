import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double w,h,area,perimeter;
		
		System.out.println("���̸� �Է��ϼ��� : ");
		h = scn.nextDouble();
		System.out.println("���̸� �Է��ϼ��� : ");
		w = scn.nextDouble();
		
		area = w * h;
		perimeter = 2.0 * (w + h);
		System.out.println("�簢���� ������ = " + area + "�Դϴ�.");
		System.out.println("�簢���� �ѷ��� = " + perimeter + "�Դϴ�.");
	}

}

