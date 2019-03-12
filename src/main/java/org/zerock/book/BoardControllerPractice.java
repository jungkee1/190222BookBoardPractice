package org.zerock.book;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/*") //views ���� �ѹ濡 Ÿ�� �������� �Ǿ�����
public class BoardControllerPractice {
	private static final Logger logger = LoggerFactory.getLogger(BoardControllerPractice.class);
	
	@Inject
	private BoardService service;
	
	@GetMapping("/list") //void�� return�����Ƿ� ���� �´��� �ڵ����� registerPratice.jsp�� Ÿ�� �Ѿ
	public void list(Model model) { //��ü����
		logger.info("Controller: ��ü���� ������...");
		List<BoardVO> vo = service.list(); 
		model.addAttribute("vo", vo);
		
	}
	
	@GetMapping("/writeForm")
	public void writeForm() { //wirteFrom.jsp �� �̵�
		
	}
	@PostMapping("write")
	public String write(BoardVO vo, RedirectAttributes rttr) { //RedirectAttributes ���� 1���� �ѱ��. ���ΰ�ħ������ �ߺ����� ���� �� ����. 
		logger.info("Controller: �Խñ� �����...");
		service.write(vo);
		logger.info("�Խñ� ��ϿϷ�..!");
		return "redirect:list";
		
	}
	@GetMapping("detail")
	public void detail(@RequestParam("seq") Long seq, Model model) {
		logger.info("Controller:�Խñ� �󼼺�����...");
		model.addAttribute("vo",service.detail(seq)); //vo��ü ���� �����ؼ� ��Ƽ� �Ⱥ����� �׳� �ѹ��� model�� ��������
	}
	@GetMapping("delete")
	public String delete(@RequestParam("seq") Long seq,RedirectAttributes rttr) {
		logger.info("Controller: �Խñ� ������..");
		service.delete(seq);
		return "redirect:list";
		
	}
	@GetMapping("updateForm")
	public void update(@RequestParam("seq") Long seq, Model model) {
		logger.info("Controller:�����ϱ���...");
		model.addAttribute("vo",service.updateForm(seq)); //vo��ü ���� �����ؼ� ��Ƽ� �Ⱥ����� �׳� �ѹ��� model�� ��������
	}
	@PostMapping("update")
	public String update(BoardVO vo, RedirectAttributes rttr) {
		logger.info("Controller: �Խñ� ������...");
		service.update(vo);
		logger.info("�Խñ� �����Ϸ�..!");
		return "redirect:list";
		
	}
	

}
