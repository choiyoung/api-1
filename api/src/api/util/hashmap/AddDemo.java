package api.util.hashmap;

import java.util.HashSet;
import java.util.Set;

/*
 java.util.hashset �� �޼ҵ���
 add() �� ����ó�� ����� �߰� ����� �Ѵ�.



set �� ��ü�� �߰��Ҷ� HashSet �� �̹� �ִ� ��ü���
�ߺ����� �����ϰ� �������� �ʴ´�. 
�׸��� false �� �����Ѵ�.

 */public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = { "1", new Integer(2), "2", "3", "3", "3", "4", };

		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		/*������ ��� 
		�̰ɷκ��� new Interger(2) �� "2"sms ���� �ٸ���.*/
		
	}
}
