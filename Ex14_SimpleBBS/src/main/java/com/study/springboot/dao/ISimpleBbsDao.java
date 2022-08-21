package com.study.springboot.dao;

import java.util.List;

import com.study.springboot.dto.SimpleBbsDto;

public interface ISimpleBbsDao {
	
	
	// 리스트 보기 위한 select 메서드 정의
	public List<SimpleBbsDto> listDao();
	
	// 개별 뷰를 보기 위한 select 메서드 정의
	public SimpleBbsDto viewDao(String id);
	
	// 글 작성을 위한 insert 메서드 정의
	public int writeDao(String writer,String title,String content);
	
	// 글 삭제를 위한 delete 메서드 정의
	public int deleteDao(String id);
	
	// 글 업데이트를 위한 update 메서드 정의
	public int updateDao(String id,String writer,String title,String content);
}
