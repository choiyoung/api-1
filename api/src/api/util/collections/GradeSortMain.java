package api.util.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GradeSortMain {
	public static void main(String[] args) {
		java.util.List<GradeVO> grades = new ArrayList<GradeVO>();

		GradeVO g1 = new GradeVO("홍길동", "2011", 80, 90, 70);
		GradeVO g2 = new GradeVO("김길동", "2012", 81, 90, 70);
		GradeVO g3 = new GradeVO("부길동", "2013", 80, 91, 70);
		GradeVO g4 = new GradeVO("댜길동", "2014", 80, 95, 70);
		System.out.println("이름 오름차순");
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		anonymous 생성자 처리  : 단한번만 쓰고 버리겠다. 
		
		*/Collections.sort(grades, new NameAscCompareImpl());
		for (GradeVO gradeVO : grades) {
			System.out.println(gradeVO);
		}
		/*System.out.println("내림차순");
		Collections.sort(grades,new NameDescCompareImpl());
		for (GradeVO gradeVO : grades) {
			System.out.println(gradeVO);
		}*/
		System.out.println("총점 오름차순 ㅊ정렬");
		 Collections.sort(grades,new TotalAscCompareImpl());
		 for (GradeVO gradeVO : grades) {
			System.out.println(grades);
		}
		 System.out.println("총점 내림차순 ㅊ정렬");
		 Collections.sort(grades,new TotalDescCompareImpl());
		 for (GradeVO gradeVO : grades) {
			System.out.println(grades);
		}
		 }
}
