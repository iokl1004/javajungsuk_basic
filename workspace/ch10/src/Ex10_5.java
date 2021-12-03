import java.util.Calendar;

public class Ex10_5 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage : java Ex10_5 2019 9");
			return;
		}
		int year = 2019;
		int month = 10;
		int START_DAY_OF_WEEK = 0;	// 1���� ����
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();// ������
		Calendar eDay = Calendar.getInstance();	//����
		
		// ���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�.
		// �������, 2019�� 11�� 1���� sDay.set(2019, 10, 1); �� ���� ���־���Ѵ�.
		sDay.set(year, 8, 1);	//2019.9.1
		eDay.set(year, 9, 1);	//2019.10.1
		
		//�������� ù��(12�� 1��)���� �Ϸ縦 ���� ������� ������ ��(11��30)�̴�.
		eDay.add(Calendar.DATE, -1);	//2019.09.30
		
		// ù ��° ������ ���� �������� �˾Ƴ���. 1���� ���� �������� �˾Ƴ���.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		// eDay�� ������ ��¥�� ���´�.
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("       " + year + "��" + month + "��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// �ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�.
		// ���� 1���� �������̶�� ������ �� �� ��´�. (�Ͽ��Ϻ��� ����)
		for(int i = 1; i < START_DAY_OF_WEEK;i++)
			System.out.print("   ");
		
		for(int i=1, n=3; i<=31; i++, n++) {
			System.out.print((i<10)? "  "+i : " "+i);
			if(n%7==0) System.out.println();
		}
		 
	}

}
