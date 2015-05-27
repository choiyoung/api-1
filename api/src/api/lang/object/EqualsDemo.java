package api.lang.object;

/*
 java.lang.Object �� �޼ҵ�
 equals() :: ���� ������ ���θ� üũ
 �ν��Ͻ� ������ �ؽ��ڵ� ��(���ּҰ�) �� ���ϴ� �޼ҵ�
 */public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		// result �� �������� �̱⶧����
		// �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
		// ���� ������ �ݽ��ÿ� ���� ����.
		String result = "";
		/* if(){}else{}�� ���´� �ϵ��ڵ����� �ͼ�����
		if (t1.equals(t2)) {
			System.out.println("t1�� t2�� ���� ����.");
		} else {
			System.out.println("t1�� t2�� ���� �ٸ���.");
		} */
		/*
		���� �����ڴ� if -else�� ��ü �ϴ� �����̴�.
		������ 
		(���ǽ�)  ? "���ΰ��" : "������ ��� " ;	
		*/result =(t1.equals(t2)) ? "t1�� t2�� ���� ����." : "t1�� t2�� ���� �ٸ���."; 
		System.out.println("�����ڸ� ���� ������ ����������  ���� ��"+result);
		t2= t1;
		result =(t1.equals(t2)) ? "t1�� t2�� ���� ����." : "t1�� t2�� ���� �ٸ���."; 
		System.out.println("�����ڸ� ���� ������ ����������  ���� ��"+result);
		
	}
}

class Temp {
	int num;

	public Temp(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		/*
		 * ��� ���´� ���� ����� �ν��Ͻ� ������ �ݽ��ÿ� �ִ� num ���� ������ �Ҵ�� ���� �ν��Ͻ� ������ �Ѱ��ְ�
		 * ����(����)���� �ڽ��� ������� �ó������� ����ȴ�.
		 */

	}
}
