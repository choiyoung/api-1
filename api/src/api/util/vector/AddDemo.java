package api.util.vector;

import java.util.Vector;

/*
 java.lang.Vector �� �޼ҵ���
 add() �� ���Ϳ� ���� �Ҵ��ϴ� ����� �Ѵ�.

 */public class AddDemo {
	public static void main(String[] args) {
     String id = "admin";
     int age = 27;//����
     boolean male =true;//���� 
     
     Vector<String> vec = new Vector<String>();
     String tom = new String("admin");
     Boolean gender = new Boolean(false);
     
     vec.add(new String("admin"));
     vec.add(String.valueOf(23));
     vec.add(String.valueOf(gender));
     vec.add("���ͷ� ���ڷ� ������ ��ü");
     //vec.add(2); int ���� �ƿ� ������ �߻� 
     
     //����
     //���ʹ� length() �� ������� �ʰ�
     //����� ����� ���ڸ� ǥ���ϴµ� ����մϴ�.
     
     for (int i = 0; i < vec.size(); i++) {
		System.out.println("������" +i+"������Ҵ�" +vec.elementAt(i));
	}
   /*  ������0������Ҵ�admin
     ������1������Ҵ�23 ==>����ó�� �������� string
     ������2������Ҵ�false ==>boolean Ÿ���� �ƴ϶� string ��
     ������2������Ҵ� ��Ҵ� : ���ͷ� ���ڷ� ������ ��ü ==> �����ͷ� ��ü�� ��� ����  */

 	}
}
