package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
    Person person = new Person("980489-432121");
    Person person2 = new Person("980489-432121");
  
    String result = "";//
    result = person==person2 ? "����"  : "�ٸ���.";
    System.out.println(result);
    result = person.equals(person2) ? "����"  : "�ٸ���.";
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
		Object �� ��� ������ Ÿ���� �ǹ��ϱ� ������
		�ݵ�� �ֹι�ȣ�� ���� �ִ� Person ������ 
		Ȯ���ؾ� �ֹι�ȣ ��ġ���θ� ������ �ֱ� ������
		��üĳ���� ������ instanceof�� ����Ѵ�. 
		�̷������ Validation ��ȣ��üũ��� �Ѵ�. 
		
		*/if (obj != null && obj instanceof Person) {
			return ssn == ((Person) obj).ssn;
			// java.lang.Object �� ��ü ĳ������
			// ��üŸ�� �� ���·� �̷�����.
		} else {
			return false;
		}
	}

}