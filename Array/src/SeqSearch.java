import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		int[]s = new int[10];
		Scanner scn = new Scanner(System.in);
		int value, index = -1;
		
		for (int i = 0; i < s.length; i++) {
			System.out.println((i+1) + "��° �� �Է� : ");
			s[i] = scn.nextInt();
		}
		System.out.println("�迭���� Ž���� �� �Է� : ");
		value = scn.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == value)
				index = i;
		}
		if(index == -1)
		System.out.println("s�迭���� " + value + "���� �����ϴ�.");
		else
			System.out.println("s�迭���� " + value + "���� s[" + index + "]�� �ֽ��ϴ�.");
	}
}