package com.rlfghks12q.ch06.dao;

import org.apache.ibatis.annotations.Mapper;

import com.rlfghks12q.ch06.dto.MemberDto;

@Mapper
public interface MemberDao {

  int insertMember(MemberDto memberDto);
  MemberDto loginMember(MemberDto memberDto);
}