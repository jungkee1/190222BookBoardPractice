package org.zerock.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book/*") //views ���� �ѹ濡 Ÿ�� �������� �Ǿ�����
public class BoardControllerPractice {
	
	@GetMapping("/listPractice") //void�� return�����Ƿ� ���� �´��� �ڵ����� registerPratice.jsp�� Ÿ�� �Ѿ
	public void register() { //ȭ�� ������� (��ü����� �̵�)
	}
	
	@GetMapping("/writeForm")
	public void writeForm() { //wirteFrom.jsp �� �̵�
		
	}

}
