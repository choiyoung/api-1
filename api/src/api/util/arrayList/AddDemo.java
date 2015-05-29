package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 java.util.ArrayList 의 메소드인
 add()  는 Vector 와 동일하다


 */public class AddDemo {
	public static void main(String[] args) {
		/*
		 * 백터는 내부적으로 String 을 사용 속도는 느리고 동기호를 지원한다. ArrayList는 내부젇적으로
		 * StringBuffer ㄹ을 사용한다 동기화 지원안함
		 */
		ArrayList<String> list = new ArrayList<String>();

		list.add("서울");
		list.add("부산");
		list.add("대구");

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
		// 인터페이스 제너릭 참조변수 = new 구현한 객체<제네릭>
		// 패턴입니다.
		list2.addAll(list);// 서울 부산 대구 를 복사 집어 넣은 상태

		for (String s : list2) {
			System.out.printf("%s", s);

		}
		System.out.println();
		// 검색 명령을 위한 데이터 추가
		list2.add("광주");
		list2.add("인천");
		list2.add("대전");
		/*
		 * 출력 5 검색해서 출력
		 */
		Iterator<String> it3 = list2.iterator();
		String str = null;
		while (it3.hasNext()) {
			str = it3.next();
			if (str.startsWith("대")) {
				System.out.printf("%s", str);
			}
		}
		System.out.println();

		list2.add("인천");
		list2.add("인천");
		list2.add("인천");

		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			System.out.printf("%s", it4.next());
			;

		}
	}

}