package api.lang.String;

/*
 java.lang.String �� ���� �޼ҵ�
 charAt() ������ ��ü �ִ� ���ڸ� ������ index  �� 0���� ����
 indexof() �־��� ���ڰ� �����ϴ��� Ȯ���Ͽ� ��ġ�� �˷���
 ������ -1��ȯ


 */public class CahrAtDemo {
	public static void main(String[] args) {
String snn = "800101-155555555";
/*
index �� 0���� �����ϹǷ�
���ฦ �����ϴ� 1���� 7��° �ε����� �����Ѵ�. 

*/
//char isMan = snn.charAt(7);
/*
indexof()�� �Ķ���ͷ� �־��� String ����
��ġ���� �����Ѵ�. "-" �� �٤��� ���� ���ฦ 
�����ϴ� ���̹Ƿ� +1�� �־���. 

*/char isMan = snn.charAt(snn.indexOf("-")+1);
switch (isMan) {
case '1' :case '3' : System.out.println("����");break;
case '2' :case '4' : System.out.println("����");break;
default:
	System.out.println("�߸��� �Է°��Դϴ�.");
	break;
}
	}
}
