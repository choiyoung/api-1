package api.util.calendar;

import java.util.Calendar;

/*
 java.lang.Calendar


 */public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월",
				"9월", "10월", "11월", "12월" };
		// Calendar.getInstance 은 내부적으로
		// 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		// 여러개의 인스턴스를 생성하지 않도록 방지하려는
		// 목적에서 코딩되었다.
		Calendar date = Calendar.getInstance();

		System.out.println("날짜");
		System.out.print(date.get(Calendar.YEAR) + "년");
		System.out.print(date.get(Calendar.MONTH) + "월");
		System.out.print(date.get(Calendar.DATE) + "일");

		System.out.println("시간");
		System.out.print(date.get(Calendar.HOUR) + "시");
		System.out.print(date.get(Calendar.MINUTE) + "분");
		System.out.println(date.get(Calendar.SECOND) + "초");

		System.out.println("====1일후==");
		date.add(Calendar.MONTH, 1);
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		/*
		 * 출력된 결과값 : java.util.GregorianCalendar
		 */
		System.out.println("====7일전==");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));

		System.out.println("특정시간으로 셋팅");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);

		System.out.println("수정된시간 출력");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);

		
		
		System.out.println("-----------------");
		System.out.print((Calendar.YEAR) + "년");
		System.out.print((Calendar.MONTH) + "월");
		System.out.print((Calendar.DATE) + "일");

	}
/*public static Calendar getNowMonth(Calendar date) {
	
	return date.add(Calendar.MONDAY, 1);
	
}*/
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) +"년" + date.get(Calendar.MONTH)
				+ "월" + date.get(Calendar.DATE) + "일";
	}
}
