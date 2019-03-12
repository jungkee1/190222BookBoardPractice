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
@RequestMapping("/*") //views 까지 한방에 타고 내려오게 되어있음
public class BoardControllerPractice {
	private static final Logger logger = LoggerFactory.getLogger(BoardControllerPractice.class);
	
	@Inject
	private BoardService service;
	
	@GetMapping("/list") //void에 return없으므로 여기 온다음 자동으로 registerPratice.jsp로 타고 넘어감
	public void list(Model model) { //전체보기
		logger.info("Controller: 전체보기 페이지...");
		List<BoardVO> vo = service.list(); 
		model.addAttribute("vo", vo);
		
	}
	
	@GetMapping("/writeForm")
	public void writeForm() { //wirteFrom.jsp 로 이동
		
	}
	@PostMapping("write")
	public String write(BoardVO vo, RedirectAttributes rttr) { //RedirectAttributes 값을 1번만 넘긴다. 새로고침등으로 중복으로 들어가는 것 방지. 
		logger.info("Controller: 게시글 등록중...");
		service.write(vo);
		logger.info("게시글 등록완료..!");
		return "redirect:list";
		
	}
	@GetMapping("detail")
	public void detail(@RequestParam("seq") Long seq, Model model) {
		logger.info("Controller:게시글 상세보기중...");
		model.addAttribute("vo",service.detail(seq)); //vo객체 따로 생성해서 담아서 안보내고 그냥 한번에 model로 보내버림
	}
	@GetMapping("delete")
	public String delete(@RequestParam("seq") Long seq,RedirectAttributes rttr) {
		logger.info("Controller: 게시글 삭제중..");
		service.delete(seq);
		return "redirect:list";
		
	}
	@GetMapping("updateForm")
	public void update(@RequestParam("seq") Long seq, Model model) {
		logger.info("Controller:수정하기중...");
		model.addAttribute("vo",service.updateForm(seq)); //vo객체 따로 생성해서 담아서 안보내고 그냥 한번에 model로 보내버림
	}
	@PostMapping("update")
	public String update(BoardVO vo, RedirectAttributes rttr) {
		logger.info("Controller: 게시글 수정중...");
		service.update(vo);
		logger.info("게시글 수정완료..!");
		return "redirect:list";
		
	}
	

}
