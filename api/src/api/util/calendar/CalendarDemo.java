package api.util.calendar;

import java.util.Calendar;

/*
 java.lang.Calendar


 */public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��",
				"9��", "10��", "11��", "12��" };
		// Calendar.getInstance �� ����������
		// ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		// �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ���
		// �������� �ڵ��Ǿ���.
		Calendar date = Calendar.getInstance();

		System.out.println("��¥");
		System.out.print(date.get(Calendar.YEAR) + "��");
		System.out.print(date.get(Calendar.MONTH) + "��");
		System.out.print(date.get(Calendar.DATE) + "��");

		System.out.println("�ð�");
		System.out.print(date.get(Calendar.HOUR) + "��");
		System.out.print(date.get(Calendar.MINUTE) + "��");
		System.out.println(date.get(Calendar.SECOND) + "��");

		System.out.println("====1����==");
		date.add(Calendar.MONTH, 1);
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		/*
		 * ��µ� ����� : java.util.GregorianCalendar
		 */
		System.out.println("====7����==");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));

		System.out.println("Ư���ð����� ����");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);

		System.out.println("�����Ƚð� ���");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);

		
		
		System.out.println("-----------------");
		System.out.print((Calendar.YEAR) + "��");
		System.out.print((Calendar.MONTH) + "��");
		System.out.print((Calendar.DATE) + "��");

	}
/*public static Calendar getNowMonth(Calendar date) {
	
	return date.add(Calendar.MONDAY, 1);
	
}*/
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) +"��" + date.get(Calendar.MONTH)
				+ "��" + date.get(Calendar.DATE) + "��";
	}
}
