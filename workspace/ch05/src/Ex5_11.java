import java.util.Arrays;

public class Ex5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭�� ���
		int[] arr = {3,4,1,0,2}; //1���� �迭 arr
		int[][] arr2D = {{11,12},{21,22}};	//2���� �迭
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		System.out.println();
		
		//�迭�� ��
		String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		System.out.println();
		
		//�迭�� ����
		int[] arr2 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		
		//�迭�� ����
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);	//�迭 arr�� ������������ ����
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

}
