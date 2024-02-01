package kr.co.fishing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.fishing.service.NoticeService;
import kr.co.fishing.vo.NoticeVO;


@Controller
//@RequestMapping("/board")
public class BoardController {


	
	@Autowired
	private NoticeService noticeService;
	
	//화면만 띄우는 것
//	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return "board/" + step;
	}
	
	
	// Notice 상세 페이지 이동
	@RequestMapping("/noticesangse")
	public void seleteNotice(NoticeVO noticevo, Model m, NoticeVO vo) {	
		m.addAttribute("notice",noticeService.seleteNoticeBoard(noticevo));
		m.addAttribute("noticeNext", noticeService.seleteNoticeNext(noticevo));
		
	

	}	
	

	
}
