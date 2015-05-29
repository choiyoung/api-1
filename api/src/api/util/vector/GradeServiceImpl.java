package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	Vector<Object> vector= new Vector<Object>();
	GradeVO vo = new GradeVO();
    
	
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		vector.addElement(vo);
	}
    /*
	성적표를 출력하는 메소드
	vo.toString 으로 처리 예상하고 있음.
	
	
	*/@Override
	public void print() {
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.elementAt(i);
		}
		for (int j = 0; j < gradeVO.length; j++) {
			System.out.println(gradeVO[j].toString() + "총점 :"
					+ gradeVO[j].getTotal());
		}

		
	}
	/*
    학번으로 검색하는 기능으로 가진 메소드	
	
*/
	@Override
	public String searchByHak(String hak) {
		int j = 0;
		/// vector 사이즈만큼 배열 크기
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		// vector안에 정보 모두 vo 변수로 저장
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		// 그런뒤 내가 찾는 학번가 일치할경우 j 로
		for (j = 0; j < gradeVO.length; j++) {
			if (gradeVO[j].getHak() == hak) {
				break;
			}
		}
		// 그런뒤 내가 찾는 학번가 일치할경우 j 로
		vo = (GradeVO) vector.elementAt(j);

		return vo.toString();
	}
/*
이름 으로 성적을 검색해서 출력하는 메소드	
	 
	
*/	@Override
	public Vector<String> searchGradeByName(String name) {
	Vector<String> vec = new Vector<String>();
	GradeVO[] gradeVO = new GradeVO[vector.size()];
	for (int i = 0; i < vector.size(); i++) {
		gradeVO[i] = (GradeVO) vector.elementAt(i);
	}
	for (int i = 0; i < gradeVO.length; i++) {
		if (gradeVO[i].getName() == name) {
			vec.removeAllElements();
			vec.add(gradeVO[i].toString());
			break;
		} else {
			vec.removeAllElements();
			vec.add("없습니다.");
		}
	}
	return vec;
	}
/*
종합점수 기준으로 내림차순으로 정렬시키는 메소드 

*/	@Override
	public void descGradeTotal() {
	GradeVO temp = null;
	GradeVO[] gradeVO = new GradeVO[vector.size()];
	// vector안에 정보 모두 vo 변수로 저장
	for (int i = 0; i < vector.size(); i++) {
		gradeVO[i] = (GradeVO) vector.get(i);
	}
	for (int j = 0; j < vector.size(); j++) {
		for (int k = j + 1; k < gradeVO.length; k++) {
			if (gradeVO[j].getTotal() > gradeVO[k].getTotal()) {
				temp = gradeVO[j];
				gradeVO[j] = gradeVO[k];
				gradeVO[k] = temp;

			}
		}

	}
	System.out.println();
	for (int i = 0; i < gradeVO.length; i++) {
		System.out.println(gradeVO[i].toString()+"총점:"+gradeVO[i].getTotal());
	}
		
	}
/*
종합점수 기준으로오름차순으로 정렬시키는 메소드 

*/	
	@Override
	public void ascGradeTotal() {
		GradeVO temp = null;
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		for (int j = 0; j < vector.size(); j++) {
			for (int k = j + 1; k > gradeVO.length; k++) {
				if (gradeVO[j].getTotal() > gradeVO[k].getTotal()) {
					temp = gradeVO[j];
					gradeVO[j] = gradeVO[k];
					gradeVO[k] = temp;

				}
			}

		}
		System.out.println();
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.println(gradeVO[i].toString() +"총점:"+gradeVO[i].getTotal());
		}
	}
		
	}


