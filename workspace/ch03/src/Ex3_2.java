
public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		
		j = i++; //������
		System.out.println("j=i++; ������, i=" + i+", j="+j);
		
		i=5; //����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;
		
		++i;
		j = i; //������
		System.out.println("j=++i; ���� ��, i=" + i +", j ="+ j);

	}

}
