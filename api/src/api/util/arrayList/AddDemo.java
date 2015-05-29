package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 java.util.ArrayList �� �޼ҵ���
 add()  �� Vector �� �����ϴ�


 */public class AddDemo {
	public static void main(String[] args) {
		/*
		 * ���ʹ� ���������� String �� ��� �ӵ��� ������ ����ȣ�� �����Ѵ�. ArrayList�� ���Π�������
		 * StringBuffer ���� ����Ѵ� ����ȭ ��������
		 */
		ArrayList<String> list = new ArrayList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("�뱸");

		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.printf("%s", it1.next());

		}
		
		System.out.println();
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			System.out.printf("%s", it2.next());
		}
		System.out.println("");

		while (it2.hasPrevious()) {
			System.out.printf("%s", it2.previous());

		}

		List<String> list2 = new ArrayList<String>();
		// �������̽� ���ʸ� �������� = new ������ ��ü<���׸�>
		// �����Դϴ�.
		list2.addAll(list);// ���� �λ� �뱸 �� ���� ���� ���� ����

		for (String s : list2) {
			System.out.printf("%s", s);

		}
		System.out.println();
		// �˻� ����� ���� ������ �߰�
		list2.add("����");
		list2.add("��õ");
		list2.add("����");
		/*
		 * ��� 5 �˻��ؼ� ���
		 */
		Iterator<String> it3 = list2.iterator();
		String str = null;
		while (it3.hasNext()) {
			str = it3.next();
			if (str.startsWith("��")) {
				System.out.printf("%s", str);
			}
		}
		System.out.println();

		list2.add("��õ");
		list2.add("��õ");
		list2.add("��õ");

		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			System.out.printf("%s", it4.next());
			;

		}
	}

}