package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
	
	//아래에 단계를 거치지않아도 추상메소드를 가진 클래스가 만들어있어서 정상으로 작동하는 것을 확인함.
}

//클래스 로딩
//커넥션 열고
//statment 얻고
//query 실행
//	SELECT sysdate FROM dual
//resultSet 처리
//커넥션 닫고
	

