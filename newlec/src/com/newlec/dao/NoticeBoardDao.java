package com.newlec.dao;

import java.util.List;

import com.newlec.domain.NoticeBoardVO;

public interface NoticeBoardDao {
	List<NoticeBoardVO> getBoardList();
	NoticeBoardVO getBoardDetail(int num);
	int getNewBoardNum(String memberId);
	// [2.출력] 메소드(1.입력)
	int insertBoard(NoticeBoardVO noticeBoard);
	int updateBoard(NoticeBoardVO noticeBoard);
	int deleteBoard(int num);
	
	
}