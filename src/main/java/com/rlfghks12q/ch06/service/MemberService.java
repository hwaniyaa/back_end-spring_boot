package com.rlfghks12q.ch06.service;

import com.rlfghks12q.ch06.dto.MemberDto;

public interface MemberService {
  
  public int insertMember(MemberDto memberDto);
  public MemberDto loginMember(MemberDto memberDto);
}
