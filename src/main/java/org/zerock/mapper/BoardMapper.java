package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper { //여기의 함수 이름으로 BoardMapper.xml 에 적힌 id로 받을 수 있음
	public Integer write(BoardVO vo); //작성하기 
	public List<BoardVO>list(); //전체보기
	public BoardVO detail(Long seq);//상세보기
	public void delete(Long seq); //삭제하기
	public BoardVO updateForm(Long seq); //수정하기 폼으로 퍼올리기
	public void update(BoardVO vo);
	

}
