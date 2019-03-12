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

	@Override //�Խñ� �߰�
	public void write(BoardVO vo) {
		// TODO Auto-generated method stub
		logger.info("Service: �Խñ� �����...");
		mapper.write(vo); 
	}

	@Override //�Խñ� ��ü����
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
		logger.info("Service: �Խñ� ��ü����...");
		return mapper.list();
	}

	@Override //�ش� �� �󼼺��� 
	public BoardVO detail(Long seq) {
		// TODO Auto-generated method stub
		logger.info("Service: �Խñ� �󼼺���...");
		BoardVO vo = mapper.detail(seq);
		return vo;
	}

	@Override //�����ϱ�
	public void delete(Long seq) {
		// TODO Auto-generated method stub
		logger.info("Srvice: �Խñ� ����...");
		mapper.delete(seq);
		
	}

	@Override //�����ϱ� ������ ���� �� �ø���
	public BoardVO updateForm(Long seq) {
		// TODO Auto-generated method stub
		logger.info("Service: �Խñ� �����ϱ� ��...");
		return mapper.updateForm(seq);
	}

	@Override //�����ϱ�
	public void update(BoardVO vo) {
		// TODO Auto-generated method stub
		logger.info("Service: �Խñ� ������...");
		mapper.update(vo); 
		
	}

}
