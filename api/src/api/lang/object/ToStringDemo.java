package api.lang.object;
/*import java.lang.Object;*///선언하지 않아도 디폴트로 임포트 되었음
public class ToStringDemo {
	public static void main(String[] args) {
  Card card1 = new Card("space", 7);
  Card card2 = new Card("heart", 2);
  System.out.println(card1);
  System.out.println(card2);
  /*
  java.lang.Object 의 toString 은 해시코드 을
  리턴하므로 , toString()을 오버라이딩해서
  원하는 결과를 얻도록 한다.
  
	*/
  }
}
//한 java 파일에 두개 이상의 클래스가 있어도 되나..
//반드시 public 은 하나여야 한다.
class Card{
	String kind;
	int number;
	public Card() {
		// TODO Auto-generated constructor stub
		this("",0);
	}
	/*
	생성자 오버로딩을 쉽게 하는 방법
	디폴트 생성자를 CTRL + space 생성 시킨후
	생성자 호출예약어인 this(파라미터 갯수와 타입을 코딩)
	또한 디폴트 생성자를 호출하더라도
	파라미터가 있는 생성자까지 호출되므로,
	생성자 파라미터 내용까지 알 필요 없이 코딩 간편해진다.
	*/public Card(String kind, int number) {
		// TODO Auto-generated constructor stub
		this.kind = kind;
		this.number = number;
	}
	//getter setter 는 필요시만 만든다.
	
	//CTRL + Space  에서 tostring 을 만들면 하드 코딩량이 늘어난다.
	//ALT + SHIFT + S 를 한후 generate toString 을 선택해서 생성한다.
	@Override
	public String toString() {
		return "카드 [무늬=" + kind + ", 숫자=" + number + "]";
	}
	

}