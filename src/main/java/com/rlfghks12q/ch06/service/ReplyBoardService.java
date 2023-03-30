package com.rlfghks12q.ch06.service;

import java.util.List;

import com.rlfghks12q.ch06.dto.ReplyBoardDto;


public interface ReplyBoardService {
  public int insertBoard(ReplyBoardDto replyBoardDto);

  public List<ReplyBoardDto> getAllBoardList(String category, String searchTxt);

  public ReplyBoardDto getSelectOne(int no);

  public int updateHit(int no);

  public int getMaxReGroup();

  public int insertReplyBoard(ReplyBoardDto replyBoardDto);

  public int updateReLevel(ReplyBoardDto replyBoardDto);

  public int deleteReplyBoard(ReplyBoardDto replyBoardDto);

  public List<ReplyBoardDto> getSearchBoardList(String searchTxt);

  public int modifyReplyBoard(ReplyBoardDto replyBoardDto);

  // 이전글
  public ReplyBoardDto getPrevSelect(int num);
  // 다음글
  public ReplyBoardDto getNextSelect(int num);
}