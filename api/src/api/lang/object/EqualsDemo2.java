package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
    Person person = new Person("980489-432121");
    Person person2 = new Person("980489-432121");
  
    String result = "";//
    result = person==person2 ? "같다"  : "다르다.";
    System.out.println(result);
    result = person.equals(person2) ? "같다"  : "다르다.";
    System.out.println(result);
	}
}

class Person {
	private String ssn;

	public Person(String ssn) {
		// TODO Auto-generated constructor stub
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// generate hashcode and equals();

	@Override
	public boolean equals(Object obj) {
		/*
		Object 는 모든 데이터 타입을 의미하기 때문에
		반드시 주민번호를 갖고 있는 Person 인지를 
		확인해야 주민번호 일치여부를 따질수 있기 때문에
		객체캐스팅 연산자 instanceof를 사용한다. 
		이런기능을 Validation 유호성체크라고 한다. 
		
		*/if (obj != null && obj instanceof Person) {
			return ssn == ((Person) obj).ssn;
			// java.lang.Object 의 객체 캐스팅은
			// 객체타입 의 형태로 이뤄진다.
		} else {
			return false;
		}
	}

}