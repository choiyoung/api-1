package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*메소드마다 공유하는 다수의 값 이 필요한데
	한군데에 저장할 컬렉션을 필드에 선언해야겠다.
	필드에 선언해야 메소드들이 값을 공유할 수 있으니까..	*/
	private Vector<GradeVO>vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	
	/*
	 * 학생별로 성적을 입력 받는 것인가.. 그럼 입력받아서 저장할 공간인데 한번 생성하면 추가로 늘릴수 없으니 동적으로 확장하는 컬렉션을
	 * 선택ㅎ야겠군 그런데 내가 지금 아는 건 백터 뿐이니 백타에 넣어야지.
	 */@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
       vc.add(vo);
	}

	// 2.print() 출력하는 것인가. 그럼 vo 객체의 toString()가져와야지
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(vc.toString());

	}

	/*
	 * 3-searchGradeByHak() 학번으로 성적을 조회하는 기능이군 학번은 오직 한 학생에게만 존재하므로 리턴값이 String
	 * 일테니 벡터의 for loop +내부에 if 를 해봐야겠다.
	 */@Override
	public String searchByHak(String hak) {
		 String msg= ""; //지역변수니까 초기화
		 for (int i = 0; i < vc.size(); i++) {
			/*
			myHak 은 백터에서    i번째 요소에서 학번을 리턴하여 담은 변수 String 
			
			*/
			 String myHak = vc.elementAt(i).getHak();
			
			/*
			파라미터로 받아온 hak  과 백터에 담겨있는
			myhak  이 일치하는지 여부를 체크하는 로직 
			
			*/if(myHak.equalsIgnoreCase(hak)){
				msg= hak;
				break;
			}else {
				msg = "조회하는 학번이 있습니다.";
				break;
			}
			
		}
		 return msg;
	 }
	

	/*
	 * 4-searchGradeByName() 이름으로 성적조회인데 리턴값이 백터인 것을 보니 복수개의 String 을 처리하게끔 설게
	 * 되었군 리턴값이 하나 든 여러개든 for loop + if 구성빡에는 백터요소 출력로직이 없으니 그걸 써야 겟다.
	 */

	@Override
	public Vector<String> searchGradeByName(String name) {
		 Vector<String> msg = new Vector<String>(); //지역변수니까 초기화
		 for (int i = 0; i < vc.size(); i++) {
			/*
			myHak 은 백터에서    i번째 요소에서 학번을 리턴하여 담은 변수 String 
			
			*/String myName = vc.elementAt(i).getName();
			
			/*
			파라미터로 받아온 hak  과 백터에 담겨있는
			myhak  이 일치하는지 여부를 체크하는 로직 
			
			*/if(name.equalsIgnoreCase(myName)){
				msg.add(name);
				break;
			}else {
				msg.add("조회하는 학번이 있습니다.");
				break;
			}
			
		}
		 return msg;
		
	}

	/*
	 * 5 - descGradeTotal() 내림차순인가보다
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub

	}
	/*6-ascGradeTotal 
	오름차순이면 Arrays.sort를 쓰면 되겠군*/
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub

	}

}
