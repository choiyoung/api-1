package api.util.vector;

import java.util.Vector;

/*
 java.util.Vector 의 메소드인
 addElement() 는 기본적으로 add() 와 동일하다.





 */public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = { "iron", "thor", "hulk", "hawk" };
		Vector<String> avengers = new Vector<String>();
		// 백터에 배열의 요소를
		for (int i = 0; i < heros.length; i++) {
      avengers.addElement(heros[i]);  
		}
		String thor = "thor";
		if (avengers.contains(thor)) {
		int idx  =avengers.indexOf(thor);
		System.out.println("초르는 "+ idx +"째에잇습니다.");
		}else {
			System.out.println("토르는 없는습니다.");
		}
		/*
		백터의 인덱스도 0부터 시작한다. 0 이곧 첫번째 요소임
		
		
		*/
		avengers.removeElementAt(0);
		System.out.println("삭제후 멤버위치 인덱스 변화");
		for (int i = 0; i < avengers.size(); i++) {
			System.out.println("Avengers의 "+(i+1)+"번쪠 멤버는"
					+ avengers.elementAt(i));
		}
	}
}
