package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {
	public static void main(String[] args) {
/*
������ Ȥ�� ���� ��� ������ 	token �̶���ϴµ�
Ư�� �����ڸ� �����ϸ� �װ��� ��������
�߶󳻴� Ŭ���� �� �޼ҵ�

		
*/
		String date = "2015/05/24";
     	StringTokenizer tok = new StringTokenizer(date,"/");
	/* �������� �Ķ���� �� �տ����� String ���ü
	 * �ڿ����� ������
		
		*/int idx =0;
		/*
		
		while 
		*/while (tok.hasMoreElements()) {
			String token = tok.nextToken();
			System.out.println(""+token);
			
		}
	}
}
