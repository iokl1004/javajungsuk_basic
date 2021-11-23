import java.util.Arrays;

public class Ex5_test {

	public static void main(String[] args) {
		//	index : 0~3-1, 0~2
//		String[] strArr = { "가위", "바위", "보" };
//		System.out.println(Arrays.toString(strArr));
//		
//		for(int i=0;i<10;i++) {
//			int tmp = (int)(Math.random()*3);
//			System.out.println(strArr[tmp]);
//		}
		
		String str = "ABCDE";
		char ch = str.charAt(4); // "E"
		String str2 = str.substring(1,4); // "BCD"
		String str3 = str.substring(1); // "BCDE"
		String str4 = str.substring(1, str.length()); // "BCDE"
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
