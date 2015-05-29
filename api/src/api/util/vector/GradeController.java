package api.util.vector;

import java.util.Vector;

import api.util.vector.answer.GradeService;
import api.util.vector.answer.GradeVO;

public class GradeController {

	public static void main(String[] args) {
		GradeServiceImpl gradeServiceImpl = new GradeServiceImpl();
		GradeVO vo = new GradeVO("100","iron", 70, 84, 90);
		GradeVO vo1 = new GradeVO("200","hulk", 70, 61, 90);
		GradeVO vo2 = new GradeVO("300","thor", 50, 80, 90);
		//input
		GradeService aa = new GradeServiceImpl();
		aa.input(vo);
		aa.input(vo1);
		aa.input(vo2);
		//���
		  System.out.println("----------------------------");
		  aa.print();
		  System.out.println("------------------111----------");
		 
	  
		//�̸��˻�
	    System.out.println("-----------------------------");
	    Vector<String> vec= new Vector<String>();
		vec = aa.searchGradeByName("hulk");
		for (String k : vec) {
			System.out.println(k);
		}
		//�й�  �˻����
		System.out.println("-----------------------------");
		System.out.println(aa.searchByHak("100"));
		System.out.println(aa.searchByHak("200"));
		System.out.println("--------------  ��������---------------");
		aa.descGradeTotal();
		System.out.println("--------------  �������� ---------------");
		aa.ascGradeTotal();

	}

}
