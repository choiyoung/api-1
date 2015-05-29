package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
    GradeService service = new GradeServiceImpl();
    /*
    일일이 setter 만들기가 귀찬다
           생성자로 한번에 만들어야지 
    */GradeVO g1 = new GradeVO("홍길동","1111",70,80,90);
    GradeVO g2 = new GradeVO("김길동","2222",70,80,90);
    GradeVO g3 = new GradeVO("김길동","3333",70,80,90);
    
    service.input(g1);
    service.input(g2);
    service.input(g3);
    service.print();
    
    String dummy = service.searchByHak("1111");
    System.out.println(dummy);
    Vector<String> temp =new Vector<String>();
    temp = service.searchGradeByName("홍길동");
    System.out.println(temp);
    }
}
