package api.lang.String;

/*
 java.lang.String �� �޼ҵ���
 toUpperCase() �� �ش� ���ڿ��� ���� �빮�ڷ� ��ȯ
 toLowerCase() �� �ش� ���ڿ��� ���� �ҹ��ڷ� ��ȯ
 valueOf()  �� �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ��

 */public class ValueOf {
	public static void main(String[] args) {
     String str = "Hello Java";
     String msg ;
     System.out.println("�׽�Ʈ�� ����" + str);
     msg = str.toUpperCase();
     System.out.println(msg);
     msg = str.toLowerCase();
     System.out.println(msg);
     //������ valueOf �� �Ķ���� ���� int ���̴�.
     //Integer.parseint �� ���� �ʰ���
     //String �� ����ƽ �޼ҵ��� ValueOf()
     //�� ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ
     
     msg = String.valueOf(str.length());
     System.out.println("valueOf �� ���" + msg);
     
	}
}