package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	public void write(BoardVO vo); //�Խñ� �߰�
	public List<BoardVO> list(); //�Խñ� ��ü����	
	public BoardVO detail(Long seq);	//�Խñ� �󼼺���
	public void delete(Long seq); //�Խñ� ���� (boolean ������ ���� �޾Ƽ� sql�� ���� �Ϸ�� �ڵ����� 1���� �Ǵ°� ������ ���� �غ� ����)
	public BoardVO updateForm(Long seq); //�����ϱ� ������ �� �ۿø���
	public void update(BoardVO vo);
	

}
