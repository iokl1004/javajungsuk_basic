
public class Ex4_11 {

	public static void main(String[] args) {
		// i=1,2,3,4,5 5번 {} 안의 내용을 반복
		for(int i=1;i<=10;i++) {
//			System.out.println("**********");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
	} //main의 끝
}