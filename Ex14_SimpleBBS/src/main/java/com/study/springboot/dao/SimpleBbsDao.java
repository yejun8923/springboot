package com.study.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.springboot.dto.SimpleBbsDto;

// 아래 클래스를 데이터베이스 처리를 목적으로 하는 빈으로 등록한다는 어노테이션
@Repository
public class SimpleBbsDao implements ISimpleBbsDao{

	@Autowired
	JdbcTemplate template; //JdbcTemplate 변수를 자동 주입 
	
	// 쿼리문의 결과가 하나이상 여러개가나오는 SQL문을 처리하기 위해서는 JDBCTEMPLEATE의 쿼리 메서드를 사용한다
	
	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("listDao()");
		
		String query="select * from simple_bbs order by id desc";
		List<SimpleBbsDto> dtos = template.query(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		
		return dtos;
	}

	//결과가 하나만 나오는 sql문을 처리하기 위해서는 JdbcTemplate의 queryForObject 메서드르 사용한다
	
	@Override
	public SimpleBbsDto viewDao(String id) {
		System.out.println("viewDao()");
		
		String query = "select * from simple_bbs where id = "+ id;
		SimpleBbsDto dto = template.queryForObject(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		return dto;
	}

	// sql의 insert,delete, update 문은 jdbctempleate의 update 메서드를 사용한다
	
	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("writerDao()");
		
		String query = "insert into simple_bbs (id,writer,title,content) " +
						" values (simple_bbs_seq.nextval,? ,? ,?)";
		
		return template.update(query,writer,title,content);
	}

	@Override
	public int deleteDao(String id) {
		System.out.println("deleteDao()");
		
		String query = "delete from simple_bbs where id= ?";
		
		return template.update(query,Integer.parseInt(id));
	}

	@Override
	public int updateDao(String id, String writer, String title, String content) {
		System.out.println("updateDao()");
		
		String query="update simple_bbs set writer=? ,title=? ,content=? where id =?";
		
		System.out.println(id);
		System.out.println(writer);
		System.out.println(title);
		System.out.println(content);
		
		
		return template.update(query,writer,title,content,Integer.parseInt(id));
	}

}
