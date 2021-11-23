import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];	//45개의 정수값을 저장하기 위한 변수
		
		//뱌열의 각 요소에 1~45의 값을 저장한다.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		System.out.println(Arrays.toString(ball));
		
		int tmp = 0;	//두 값을 바꾸는데 사용할 변수
		int j = 0;	// 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 저장
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random()) * 45; //0~44범위의 임의값
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		
		for(int i = 0; i<6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
	}

}
