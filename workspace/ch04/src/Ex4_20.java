import java.util.Scanner;

public class Ex4_20 {
	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);

		//while���� outer��� �̸��� ������.
		outer:
		while(true) { //���� �ݺ���
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3) �� �����ϼ���. (����:0)>");

			String tmp = scanner.nextLine(); //ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp);	// �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

			if(menu == 0) {
				//System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1 <= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)");
				continue;
			}

			for(;;) { //���� �ݺ��� (for��)
			//while(true) //���ѹݺ��� (while��)
				System.out.print("����� ���� �Է��ϼ���. (��� ����:0, ��ü ����: 99)>");
				tmp = scanner.nextLine();//ȭ�鿡�� �Է¹��� ������ tmp�� ����
				num = Integer.parseInt(tmp);	//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

				if(num==0)
					break;	//��� ����, for���� �����.

				if(num==99)
					break outer; //��ü ����, for���� while���� ��� �����.

				switch(menu) {
				case 1:
					System.out.println("reuslt="+num*num);
					break;
				case 2:
					System.out.println("result="+Math.sqrt(num)); //������ ���ϱ�
					break;
				case 3:
					System.out.println("result="+Math.log(num)); //�α� ���ϱ�
					break;
				} //switch
			} //for
		} //while
		System.out.println("���α׷��� ����Ǿ����ϴ�!");

	} //main�� ��

}
