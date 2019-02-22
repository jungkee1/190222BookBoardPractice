package org.zerock.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*") //views 까지 한방에 타고 내려오게 되어있음
public class BoardControllerPractice {
	
	@GetMapping("/registerPractice") //void에 return없으므로 여기 온다음 자동으로 registerPratice.jsp로 타고 넘어감
	public void register() {
	}
	

}
