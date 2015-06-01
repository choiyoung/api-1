package api.util.collection;
/*
컬렉션 프레임 워크(Collection)
다수의 데이터를 쉽게 처리할 수 있는 표준화된 방법을 제공하는 클래스들.
3가지 타입으로 기능을 요약하고 3개의 인터페이스 List,Set,Map 으로
나누어 구현함]
후에 List 와 Set  의 공통 부분을 뽑아서 새로운
인터페이스인 Collection 을 정의함 

*/
/*
-요소 (element) 라고 불리는 객체들의 집합.
-객체들의 컨테이너 
-요소들의 개수에 따라 동적으로 크기(size) 가 변한다.
다양한 갹채들을 삽입, 삭제, 검색등을 위한 관리 편하다.

 인터페이스 종류
 -List  : 순서있음 , 데이터 중복 허용 ,  구현클래수 : ArrayList,LinkList,Stack,Vector;
 -Set : 순서없음, 중복 불허용 , 구현클래스 : HashSet ,TreeSet 등
 -Map : 키값은 중복없고, 벨류는 중복허용, 
 
 Iterator iterator()  : while()  문과 함꼐 쓰이면서 요소를 출력하는 기능 한가지에 특화됨
 Set entrySet() // javaScript 에서 JSON 과 같은 기능
 Set KeySet() Map 에 저장된 모든 Key반환
 Collection values() Map 에 저장된 모든 value 반환

*/public class CollectionSyntax {

}
