import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] score; //1. �迭 score�� ����(��������)
		//		score = new int[5]; // 2. �迭�� ����(int������� x 5)

		//		int[] score = new int[5]; //�迭�� ����� ������ ���ÿ�
		//		score[3] = 100;
		//		
		//		System.out.println(score[3]);
		//		
		//		System.out.println("score[0] = " + score[0]);
		//		System.out.println("score[1] = " + score[1]);
		//		System.out.println("score[2] = " + score[2]);
		//		System.out.println("score[3] = " + score[3]);
		//		System.out.println("score[4] = " + score[4]);
		//		
		//		int value = score[3];
		//		System.out.println("value = " + value);

		// index���� : 0~9
		//		int[] arr = new int[10];	//���̰� 5�� int�迭 arr�� ����
		//		System.out.println("arr.length = " + arr.length);
		//		
		//		for(int i=0; i<arr.length; i++) {
		//			System.out.println("arr["+i+"]="+arr[i]);
		//		}

		//		int[] iArr = {100,95,80,70,60};
		//		for(int i=0;i<iArr.length;i++) {
		//			System.out.println(iArr[i]);
		//		}
		//
		//		System.out.println(Arrays.toString(iArr));

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i =0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;	//1~10�� ���ڸ� �������
		}

		for (int i =0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;	//1~10�� ���ڸ� �������
		}

		//�迭�� ����� ������ ����Ѵ�.
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");
		}

		System.out.println();

		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
		System.out.println(chArr);


	}
}
