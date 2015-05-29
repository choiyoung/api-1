package api.util.vector;

import java.util.Vector;

import api.util.vector.answer.GradeService;
import api.util.vector.answer.GradeVO;

public class CopyOfGradeServiceImpl implements GradeService {
	Vector<Object> vector= new Vector<Object>();
	GradeVO[] gradeVO;
	GradeVO vo;
	Vector<GradeVO> grade = new Vector<GradeVO>();
    
	
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		vector.addElement(vo);
	}
    /*
	����ǥ�� ����ϴ� �޼ҵ�
	vo.toString ���� ó�� �����ϰ� ����.
	
	
	*/@Override
	public void print() {
		gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.elementAt(i);
		}
		for (int j = 0; j < gradeVO.length; j++) {
			System.out.println(gradeVO[j].toString() + "���� :"
					+ gradeVO[j].getTotal());
		}
	}	
	public void print1() {
		gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			vo=(GradeVO) vector.elementAt(i);
			vo.getTotal();
			grade.addElement(vo);
			System.out.println(vector.elementAt(i));
		}
		for (int j = 0; j < grade.size(); j++) {
			/*System.out.println(gradeVO[j].toString() + "���� :"
					+ gradeVO[j].getTotal());*/
			
		}

		
	}
	/*
    �й����� �˻��ϴ� ������� ���� �޼ҵ�	
	
*/
	@Override
	public String searchByHak(String hak) {
		int j = 0;
		String result ="";
		/// vector �����ŭ �迭 ũ��
		gradeVO = new GradeVO[vector.size()];
		GradeVO vo = new GradeVO();
		// vector�ȿ� ���� ��� vo ������ ����
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		// �׷��� ���� ã�� �й��� ��ġ�Ұ�� j ��
		for (j = 0; j < gradeVO.length; j++) {
			if (gradeVO[j].getHak() == hak) {
				vo = (GradeVO) vector.elementAt(j);
				result = vo.toString();
				break;
			}else{
				result ="�����ϴ�.";
			}
		}
		// �׷��� ���� ã�� �й��� ��ġ�Ұ�� j ��
		
		return result;
	}
/*
�̸� ���� ������ �˻��ؼ� ����ϴ� �޼ҵ�	
	 
	
*/	@Override
	public Vector<String> searchGradeByName(String name) {
	Vector<String> vec = new Vector<String>();
	gradeVO = new GradeVO[vector.size()];
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
			vec.add("�����ϴ�.");
		}
	}
	return vec;
	}
/*
�������� �������� ������������ ���Ľ�Ű�� �޼ҵ� 

*/	@Override
	public void descGradeTotal() {
	GradeVO temp = null;
	gradeVO = new GradeVO[vector.size()];
	// vector�ȿ� ���� ��� vo ������ ����
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
		System.out.println(gradeVO[i].toString()+"����:"+gradeVO[i].getTotal());
	}
		
	}
/*
�������� �������ο����������� ���Ľ�Ű�� �޼ҵ� 

*/	
	@Override
	public void ascGradeTotal() {
		GradeVO temp = null;
		gradeVO = new GradeVO[vector.size()];
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
			System.out.println(gradeVO[i].toString() +"����:"+gradeVO[i].getTotal());
		}
	}
		
	}


