
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] s = new int[10]; //배열명, 데이터 타입, 크기
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
			
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		

	}

}
