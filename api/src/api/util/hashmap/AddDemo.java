package api.util.hashmap;

import java.util.HashSet;
import java.util.Set;

/*
 java.util.hashset 의 메소드인
 add() 는 백터처럼 요소의 추가 기능을 한다.



set 은 객체를 추가할때 HashSet 에 이미 있는 객체라면
중복으로 간주하고 저장하지 않는다. 
그리고 false 를 리턴한다.

 */public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = { "1", new Integer(2), "2", "3", "3", "3", "4", };

		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		/*저장요소 출력 
		이걸로보아 new Interger(2) 와 "2"sms 서로 다르다.*/
		
	}
}
