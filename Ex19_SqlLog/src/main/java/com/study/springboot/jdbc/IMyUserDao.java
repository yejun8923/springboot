package com.study.springboot.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


// 다음 인터페이스의 구현을 xml로 한다는 의미
@Mapper
public interface IMyUserDao {
	List<MyUserDto> list();
}
