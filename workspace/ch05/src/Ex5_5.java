import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];	//45���� �������� �����ϱ� ���� ����
		
		//���� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		System.out.println(Arrays.toString(ball));
		
		int tmp = 0;	//�� ���� �ٲٴµ� ����� ����
		int j = 0;	// ������ ���� �� ������ ����
		
		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ����
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random()) * 45; //0~44������ ���ǰ�
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
