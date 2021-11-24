
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);	//add 메서드 호출
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);	//둘 중에 큰 값을 반환하는 메서드
		long result6 = mm.min(5L, 3L);	//둘 중에 큰 값을 반환하는 메서드
		mm.printGugudan(6);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result5);
		System.out.println("min(5L, 3L) = " + result6);

	}

}

class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <= 9))
			return;	//입력 받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
//		return;
	}
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	// 두 값을 입력 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		if(a>b)
			return a;	//조건식이 참일때만 실행
		else
			return b;
	}
	// 두 값을 입력 받아서 둘중에 작은 값을 반환하는 메서드를 작성하시오.
	long min(long a, long b) {
		long result = 0;
		
		//삼항연산자를 사용하면 아래의 식으로
		result = a < b ? a : b;
		//if문을 사용하면 아래의 식으로
//		if(a<b) {
//			result = a;
//		} else {
//			result = b;
//		}
		return  result;
	}
	
	long subtract(long a, long b) {	return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(long a, long b) { 
		return a / b; 
	}
}