package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	public void write(BoardVO vo); //게시글 추가
	public List<BoardVO> list(); //게시글 전체보기	
	public BoardVO detail(Long seq);	//게시글 상세보기
	public void delete(Long seq); //게시글 삭제 (boolean 형으로 리턴 받아서 sql문 삭제 완료시 자동으로 1리턴 되는거 다음에 적용 해볼 예정)
	public BoardVO updateForm(Long seq); //수정하기 폼으로 글 퍼올리기
	public void update(BoardVO vo);
	

}
