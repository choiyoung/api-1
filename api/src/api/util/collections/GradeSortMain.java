package api.util.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GradeSortMain {
	public static void main(String[] args) {
		java.util.List<GradeVO> grades = new ArrayList<GradeVO>();

		GradeVO g1 = new GradeVO("ȫ�浿", "2011", 80, 90, 70);
		GradeVO g2 = new GradeVO("��浿", "2012", 81, 90, 70);
		GradeVO g3 = new GradeVO("�α浿", "2013", 80, 91, 70);
		GradeVO g4 = new GradeVO("���浿", "2014", 80, 95, 70);
		System.out.println("�̸� ��������");
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		anonymous ������ ó��  : ���ѹ��� ���� �����ڴ�. 
		
		*/Collections.sort(grades, new NameAscCompareImpl());
		for (GradeVO gradeVO : grades) {
			System.out.println(gradeVO);
		}
		/*System.out.println("��������");
		Collections.sort(grades,new NameDescCompareImpl());
		for (GradeVO gradeVO : grades) {
			System.out.println(gradeVO);
		}*/
		System.out.println("���� �������� ������");
		 Collections.sort(grades,new TotalAscCompareImpl());
		 for (GradeVO gradeVO : grades) {
			System.out.println(grades);
		}
		 System.out.println("���� �������� ������");
		 Collections.sort(grades,new TotalDescCompareImpl());
		 for (GradeVO gradeVO : grades) {
			System.out.println(grades);
		}
		 }
}
