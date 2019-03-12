package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper { //������ �Լ� �̸����� BoardMapper.xml �� ���� id�� ���� �� ����
	public Integer write(BoardVO vo); //�ۼ��ϱ� 
	public List<BoardVO>list(); //��ü����
	public BoardVO detail(Long seq);//�󼼺���
	public void delete(Long seq); //�����ϱ�
	public BoardVO updateForm(Long seq); //�����ϱ� ������ �ۿø���
	public void update(BoardVO vo);
	

}
