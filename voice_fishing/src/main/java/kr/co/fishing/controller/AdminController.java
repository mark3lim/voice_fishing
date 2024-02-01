package kr.co.fishing.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import kr.co.fishing.service.FaqServiceImpl;
import kr.co.fishing.service.NoticeServiceImpl;
import kr.co.fishing.vo.FaqVO;
import kr.co.fishing.vo.NoticeVO;

@Controller
//@RequestMapping("/pages")
public class AdminController {

	@Autowired
	private FaqServiceImpl faqService;


	@Autowired
	private NoticeServiceImpl noticeService;

	

	//화면만
//	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return "pages/" + step;
	}

	// ******************** FAQ

	// Faq 등록
	@RequestMapping("/insertFaq")
	public String insertFaq(FaqVO faqvo, Model m) {
		System.out.println("faq 글등록");
		faqService.insertFaqBoard(faqvo);
		m.addAttribute("faqList", faqService.getFaqBoardList(faqvo));
		return "redirect:../pages/faq";
	}

	// Faq 목록 출력
	@RequestMapping("/faq")
	public void selectFaq(FaqVO faqvo, Model m) {
		System.out.println("faq 목록 출력");
		m.addAttribute("faqContent", faqService.getFaqBoardList(faqvo));
	}

	// Faq 상세 페이지 이동
	@RequestMapping("/modifyFaq")
	public String seleteFaqBoard(FaqVO faqvo, Model m) {
		m.addAttribute("faq", faqService.seleteFaqBoard(faqvo));
		return "pages/modifyFaq";
	}

	// Faq 수정
	@RequestMapping("/updateFaq")
	public String updateFaqBoard(FaqVO faqvo) {
		faqService.updateFaqBoard(faqvo);
		System.out.println(faqvo);
		return "redirect:../pages/faq";
	}

	// Faq 삭제
	@RequestMapping("/deleteFaq")
	public String deleteNotice(FaqVO faqvo, Model m) {
		faqService.deleteFaqBoard(faqvo);
		System.out.println("게시글 삭제");
		m.addAttribute("faqDeleteList", faqService.seleteFaqBoard(faqvo));
		return "redirect:../pages/faq";
	}

	// ******************** Notice

	// Notice 등록
	@RequestMapping("/insertNotice")
	public String insertNotice(NoticeVO noticevo, Model m) {
		System.out.println("게시물등록록ㄹ고록로고" + noticevo);
		noticeService.insertNotice(noticevo);
		m.addAttribute("noticeList", noticeService.selectAllNotice(noticevo));
		return "redirect:../pages/notice";
	}
	


	// Notice 수정
	@RequestMapping("/updateNotice")
	public String updateNoticeBoard(NoticeVO noticevo) {
		System.out.println("FAQ 글수정");
		noticeService.updateNoticeBoard(noticevo);
		System.out.println("업데이트트트트트트트틑" + noticevo);
		return "redirect:../pages/notice";
	}

	// Notice 상세 페이지 이동
	@RequestMapping("/modifyNotice")
	public void seleteNotice(NoticeVO noticevo, Model m) {
		m.addAttribute("notice", noticeService.seleteNoticeBoard(noticevo));
	}

	// Notice 삭제
	@RequestMapping("/deleteNotice")
	public String deleteNotice(NoticeVO noticevo, Model m) {
		noticeService.deleteNoticeBoard(noticevo);
		System.out.println("노티슺 ㅗ난게시글 삭제");
		m.addAttribute("noticeDeleteList", noticeService.seleteNoticeBoard(noticevo));
		return "redirect:../pages/notice";
	}









	


	

}
