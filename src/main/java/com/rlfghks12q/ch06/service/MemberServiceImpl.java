package com.rlfghks12q.ch06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlfghks12q.ch06.dao.MemberDao;
import com.rlfghks12q.ch06.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
  
  @Autowired
  MemberDao memberDao;

  @Override
  public int insertMember(MemberDto memberDto) {
    int result = memberDao.insertMember(memberDto);
    return result;
  }

  @Override
  public MemberDto loginMember(MemberDto memberDto) {
    MemberDto loginmemberDto = memberDao.loginMember(memberDto);
    return loginmemberDto;
  }

}
