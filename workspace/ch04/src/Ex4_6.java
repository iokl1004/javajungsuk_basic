import java.util.Scanner;

public class Ex4_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� ���� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); //ȭ���� ���� �Է¹���

		switch(month) {
		case 3: case 4: case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		default:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	}
}