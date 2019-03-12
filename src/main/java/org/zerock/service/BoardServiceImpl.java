package org.zerock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Autowired
	private BoardMapper mapper;

	@Override //게시글 추가
	public void write(BoardVO vo) {
		// TODO Auto-generated method stub
		logger.info("Service: 게시글 등록중...");
		mapper.write(vo); 
	}

	@Override //게시글 전체보기
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
		logger.info("Service: 게시글 전체보기...");
		return mapper.list();
	}

	@Override //해당 글 상세보기 
	public BoardVO detail(Long seq) {
		// TODO Auto-generated method stub
		logger.info("Service: 게시글 상세보기...");
		BoardVO vo = mapper.detail(seq);
		return vo;
	}

	@Override //삭제하기
	public void delete(Long seq) {
		// TODO Auto-generated method stub
		logger.info("Srvice: 게시글 삭제...");
		mapper.delete(seq);
		
	}

	@Override //수정하기 폼으로 정보 퍼 올리기
	public BoardVO updateForm(Long seq) {
		// TODO Auto-generated method stub
		logger.info("Service: 게시글 수정하기 폼...");
		return mapper.updateForm(seq);
	}

	@Override //수정하기
	public void update(BoardVO vo) {
		// TODO Auto-generated method stub
		logger.info("Service: 게시글 수정중...");
		mapper.update(vo); 
		
	}

}
