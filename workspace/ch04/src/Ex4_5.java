import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade = ' ', opt = '0';

		System.out.print("������ �Է����ּ���.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score�� ����

		System.out.printf("����� ������ %d�Դϴ�. \n", score);

		if (score>=90) {
			grade = 'A';
			if (score >= 98) {	//90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';
			} else if (score < 94) //90�� �̻� 94�� �̸��� A-
				opt = '-';
		} else if (score>=80) { // score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = 'B';
			if (score >= 88) {	//80�� �̻� �߿����� 88�� �̻��� B+
				opt = '+';
			} else if (score < 84) //80�� �̻� 84�� �̸��� B-
				opt = '-';
		} else {			// �������� C ����(grade)
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.\n", grade, opt);
	}
}
