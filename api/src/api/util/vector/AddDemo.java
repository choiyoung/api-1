package api.util.vector;

import java.util.Vector;

/*
 java.lang.Vector 의 메소드인
 add() 는 백터에 값을 할당하는 기능을 한다.

 */public class AddDemo {
	public static void main(String[] args) {
     String id = "admin";
     int age = 27;//나이
     boolean male =true;//성별 
     
     Vector<String> vec = new Vector<String>();
     String tom = new String("admin");
     Boolean gender = new Boolean(false);
     
     vec.add(new String("admin"));
     vec.add(String.valueOf(23));
     vec.add(String.valueOf(gender));
     vec.add("리터럴 문자로 생성된 객체");
     //vec.add(2); int 형은 아예 에러가 발생 
     
     //주의
     //백터는 length() 를 사용하지 않고
     //사이즈를 요소의 숫자를 표현하는데 사용합니다.
     
     for (int i = 0; i < vec.size(); i++) {
		System.out.println("백터의" +i+"번쨰요소는" +vec.elementAt(i));
	}
   /*  백터의0번쨰요소는admin
     백터의1번쨰요소는23 ==>숫자처럼 보이지만 string
     백터의2번쨰요소는false ==>boolean 타입이 아니라 string 임
     백터의2번쨰요소는 요소는 : 리터럴 문자로 생성된 객체 ==> ㄹ리터럴 객체도 사용 가능  */

 	}
}
