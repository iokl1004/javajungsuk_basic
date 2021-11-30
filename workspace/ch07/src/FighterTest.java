abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�.");}
}

interface Fightable { // �������̽��� ��� �޼���� public abstract. ���ܾ���
	void move(int x, int y);	//public abstract�� ������
	void attack(Fightable f);	//public abstract�� ������
}

class Fighter extends Unit2 implements Fightable {
	// �������̵� ��Ģ: ����(public)���� ���������ڰ� ������ ������ �ȵȴ�.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
	
	//�ο�� �մ� ��븦 �ҷ��´�.
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter�� �����ؼ� ��ȯ
		return (Fightable)f;
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();

	}
}
