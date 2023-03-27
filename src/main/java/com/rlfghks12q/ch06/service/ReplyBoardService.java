package com.rlfghks12q.ch06.service;

import java.util.List;

import com.rlfghks12q.ch06.dto.ReplyBoardDto;


public interface ReplyBoardService {
  public int insertBoard(ReplyBoardDto replyBoardDto);

  public List<ReplyBoardDto> getAllBoardList();

  public ReplyBoardDto getSelectOne(int no);

  public int updateHit(int no);

  public int getMaxReGroup();

  public int insertReplyBoard(ReplyBoardDto replyBoardDto);

  public int updateReLevel(ReplyBoardDto replyBoardDto);
}
