package org.zerock.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*") //views ���� �ѹ濡 Ÿ�� �������� �Ǿ�����
public class BoardControllerPractice {
	
	@GetMapping("/registerPractice") //void�� return�����Ƿ� ���� �´��� �ڵ����� registerPratice.jsp�� Ÿ�� �Ѿ
	public void register() {
	}
	

}
