package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
    GradeService service = new GradeServiceImpl();
    /*
    ������ setter ����Ⱑ ������
           �����ڷ� �ѹ��� �������� 
    */GradeVO g1 = new GradeVO("ȫ�浿","1111",70,80,90);
    GradeVO g2 = new GradeVO("��浿","2222",70,80,90);
    GradeVO g3 = new GradeVO("��浿","3333",70,80,90);
    
    service.input(g1);
    service.input(g2);
    service.input(g3);
    service.print();
    
    String dummy = service.searchByHak("1111");
    System.out.println(dummy);
    Vector<String> temp =new Vector<String>();
    temp = service.searchGradeByName("ȫ�浿");
    System.out.println(temp);
    }
}
