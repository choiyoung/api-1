package api.lang.wrapper;

/*
 JDK1.5 ���� ���Ե� ����ڽ� �������
 ��ȯ���� �⺻���� ���� wrapper class �̸�..
 ���� ���̰� ����.
 �׷��� pareint()�� valueOf()�� ���̰� ����.


 */public class PareIntDemo {
	public static void main(String[] args) {
     //���ͷ����� �⺻������ ĳ���ý� ��ȯ���
	 //�� String =>int
		int num1 = Integer.parseInt("200");
		int num3 = Integer.parseInt("200");
		int result = num1+num3;
		System.out.println(result);
		//�⺻����  ���������� ����ȯ �ϴ� ���(ĳ���� ��������)
		//Integer num3 =(Integer)result;
		Integer num4 = result;
		System.out.println("�⺻���� ���������� ����ȯ�� ���"+num4);
		int num5 =2+num3;
		System.out.println("�������� �⺻������ ������ :"+num5);
	}
}
