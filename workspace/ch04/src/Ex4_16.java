
public class Ex4_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) { //���� �ݺ��� while��
			if(sum > 100)
				break; //�ڽ��� ���� �ݺ����� �����.
			++i;
			sum += i;
		} //end of while
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
//		for(;;) { //���� �ݺ��� for��
//			if(sum > 100)
//				break; //�ڽ��� ���� �ݺ����� �����.
//			++i;
//			sum += i;
//		} //end of while
//		
//		System.out.println("i=" + i);
//		System.out.println("sum=" + sum);
	}

}