package com.rlfghks12q.ch06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rlfghks12q.ch06.dto.ReplyBoardDto;

@Mapper
public interface ReplyBoardDao {
  int insertBoard(ReplyBoardDto replyBoardDto);
  List<ReplyBoardDto> getAllBoardList();
  ReplyBoardDto getSelectOne(int no);
  int updateHit(int no);
  int getMaxReGroup();
  int insertReplyBoard(ReplyBoardDto replyBoardDto);
  int updateReLevel(ReplyBoardDto replyBoardDto);
}
