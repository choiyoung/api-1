package api.lang.String;
/*
java.lang.String ����
split("������")�޼ҵ�
�����ڸ� �������� String ���ڿ��� �и��Ͽ�
�迭�� (ArrayList ����)�� ���� ��� ���
�ڿ� ���ڰ� ������ �ܾ���� ������ �ְ�
������ ����Ʈ�� �� ������ �ش�.


*/import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
               System.out.println("\t"+fruits[i]);
		}
		System.out.println();
		System.out.println("split() ��°��");
		
		String[] fruit2= fruit.split(",",1);
		
		System.out.println("����1"+Arrays.toString(fruit2));
		String[] fruit3= fruit.split(",",2);
		System.out.println("����2"+Arrays.toString(fruit3));
		String[] fruit4= fruit.split(",",3);
		System.out.println("����3"+Arrays.toString(fruit4));
		
		String[] fruit5= fruit.split(",",4);
		System.out.println("����4"+Arrays.toString(fruit5));
		
		/*for (int i = 0; i < fruit2.length; i++) {
               System.out.println("\t"+fruit2[i]);
		}*/
	}
}
