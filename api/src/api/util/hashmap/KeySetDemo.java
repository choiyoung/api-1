package api.util.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//Map�� ���� �Է��ϴ� ���=> 1������ ���� 
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(66));
		map.put("��Ʈ�� �ڹ�", new Integer(10));
		
		/*
		 * GoF �� ������ ���� �߿��� Iterator �����̶�� �Ҹ���� Map ���� ���� �����ϴ� ����ȭ�� �����̴�.
		 */
		/*
	    �ɿ��� Ű���� �������� ���� ��Ȳ�� ���� ����Ҷ���
	    entrySet()���
	    �ʿ��� Ű���� ����� ���
	    keySet()���
	    ��, ��� ������ set���
	    ������ �÷��ǿ���
	    �������̽��� Set , List ,Map  ������ ��ǥ���ε�
	    set �� map �� �ε��� ���� ��� ��ȣ ȣȯ�� �ߵǰ�
	    Set �� �ߺ��� ���� ����� �־
	    Map ���� Ű������ �ߺ��� ����� �ϴ� �κа��� ��ġ��
	    Set�� ���� Ű�� , Ȥ�� Ű +�������� ����ϴµ� ���δ�.
	    ����� ���� Iterator �� ���
	    Set��Iterator �� ����ϱ� �����̴�. 
		
		 Map ���� ���� ����ϴ� ���� 3�����ε�..
		 ù��°�� Ű + ��� ���·� �Բ�����ϴ� ���
		 entryset()+Iterator ���� ���
		
		
		
		*/Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("������ : " + e.getKey() + "����" + e.getValue());

		}
		/*
		 Map ���� ���� ����ϴ� ���� 3�����ε�..
		 ù��°�� Ű �鸸����ϴ� ���
		 Keyset���
		
		*/set = map.keySet();
		System.out.println("������ ��� : " + set);
		/*
		 Map ���� ���� ����ϴ� ���� 3�����ε�..
		 �������� ����(��) �鸸����ϴ� ���
		 Collection���
		
		*/
		//Collection ���� ��Ŭ���� ����
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer)it.next();
			total = i.intValue();
		}
		System.out.println("���� : " + total);
		//set �� List  �迭�� Ŭ���� ó�� ����� ������ size() �� �Ѵ�. 
		System.out.println("��� :" + total/set.size());
		//Collections.max �� �ִ밪 , ,min �� �ּҰ��� �����Ѵ�.
		System.out.println("���� : " + Collections.max(values));
		System.out.println("���� : " + total);
		
	}
}
