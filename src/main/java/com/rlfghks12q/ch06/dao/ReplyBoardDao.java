package com.rlfghks12q.ch06.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rlfghks12q.ch06.dto.ReplyBoardDto;

@Mapper
public interface ReplyBoardDao {
  int insertBoard(ReplyBoardDto replyBoardDto);
  List<ReplyBoardDto> getAllBoardList(HashMap<String, Object> hashMap);
  // List<ReplyBoardDto> getSearchBoardList(String searchTxt);
  ReplyBoardDto getSelectOne(int no);
  int updateHit(int no);
  int getMaxReGroup();
  int insertReplyBoard(ReplyBoardDto replyBoardDto);
  int updateReLevel(ReplyBoardDto replyBoardDto);
  int deleteReplyBoard(ReplyBoardDto replyBoardDto);
  // List<ReplyBoardDto> searchReplyBoard(String searchTxt);

  // 게시글 수정
  int modifyReplyBoard(ReplyBoardDto replyBoardDto);
  // 이전글
  ReplyBoardDto getPrevSelect(int num);
  // 다음글
  ReplyBoardDto getNextSelect(int num);
}
