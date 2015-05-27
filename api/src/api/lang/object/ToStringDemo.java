package api.lang.object;
/*import java.lang.Object;*///�������� �ʾƵ� ����Ʈ�� ����Ʈ �Ǿ���
public class ToStringDemo {
	public static void main(String[] args) {
  Card card1 = new Card("space", 7);
  Card card2 = new Card("heart", 2);
  System.out.println(card1);
  System.out.println(card2);
  /*
  java.lang.Object �� toString �� �ؽ��ڵ� ��
  �����ϹǷ� , toString()�� �������̵��ؼ�
  ���ϴ� ����� �򵵷� �Ѵ�.
  
	*/
  }
}
//�� java ���Ͽ� �ΰ� �̻��� Ŭ������ �־ �ǳ�..
//�ݵ�� public �� �ϳ����� �Ѵ�.
class Card{
	String kind;
	int number;
	public Card() {
		// TODO Auto-generated constructor stub
		this("",0);
	}
	/*
	������ �����ε��� ���� �ϴ� ���
	����Ʈ �����ڸ� CTRL + space ���� ��Ų��
	������ ȣ�⿹����� this(�Ķ���� ������ Ÿ���� �ڵ�)
	���� ����Ʈ �����ڸ� ȣ���ϴ���
	�Ķ���Ͱ� �ִ� �����ڱ��� ȣ��ǹǷ�,
	������ �Ķ���� ������� �� �ʿ� ���� �ڵ� ����������.
	*/public Card(String kind, int number) {
		// TODO Auto-generated constructor stub
		this.kind = kind;
		this.number = number;
	}
	//getter setter �� �ʿ�ø� �����.
	
	//CTRL + Space  ���� tostring �� ����� �ϵ� �ڵ����� �þ��.
	//ALT + SHIFT + S �� ���� generate toString �� �����ؼ� �����Ѵ�.
	@Override
	public String toString() {
		return "ī�� [����=" + kind + ", ����=" + number + "]";
	}
	

}