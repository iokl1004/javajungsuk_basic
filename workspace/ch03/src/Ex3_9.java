
public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; //1,000,000 1백만
		int b = 2_000_000; //2,000,000 2백만
		
		// 10의 12제곱,	int의 범위는 10의 9제곱
		long c = a * (long)b;	// a * b = 2,000,000,000,000 ?
		
		System.out.println(c);
	}

}
