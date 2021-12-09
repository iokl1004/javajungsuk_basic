import java.util.*;

class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");

		while(true) {
			System.out.println(">>");
			try {
				//ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();

				if("".equals(input)) continue;

				if(input.equalsIgnoreCase("q")) {
					System.exit(0);	//���α׷� ����
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ���ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);	//�Է¹��� ���ɾ �����ϰ�,

					// LinkedList�� ������ �����ش�.
					LinkedList list = (LinkedList)q;

					final int SIZE = list.size();
					for(int i = 0;i<list.size();i++)
						System.out.println((i+1) + "." + list.get(i));
				}	else {
					save(input);
					System.out.println(input);
				}	//if(input.equalsIgnoreCase("q")) {
			} catch ( Exception e ){
				System.out.println("�Է¿����Դϴ�.");
			}
		} //while(true)
	} //main()
	public static void save(String input) {
		//queue�� �����Ѵ�.
		if(!"".equals(null))	//if(input!=null && !input.equals(""))
			q.offer(input);	// ť�� ���ɾ ����

		// queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE)	//size()�� Collection�������̽��� ����
			q.poll();
	}

}