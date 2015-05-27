package api.lang.String;

/*
 java.lang.String 에 속한 메소드
 charAt() 지정된 위체 있는 문자를 리턴함 index  는 0부터 시작
 indexof() 주어진 문자가 존재하는지 확인하여 위치를 알려줌
 없으면 -1반환


 */public class CahrAtDemo {
	public static void main(String[] args) {
String snn = "800101-155555555";
/*
index 는 0부터 시작하므로
남녀를 구별하는 1값은 7번째 인덱스에 위차한다. 

*/
//char isMan = snn.charAt(7);
/*
indexof()는 파라미터로 주어진 String 값의
위치값을 리턴한다. "-" 의 다ㄹ음 값을 남녀를 
구분하는 값이므로 +1을 주었다. 

*/char isMan = snn.charAt(snn.indexOf("-")+1);
switch (isMan) {
case '1' :case '3' : System.out.println("남성");break;
case '2' :case '4' : System.out.println("여성");break;
default:
	System.out.println("잘못된 입력값입니다.");
	break;
}
	}
}
