package kr.co.fishing.service.impl;



import java.util.List;

import kr.co.fishing.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fishing.dao.FaqDAO;
import kr.co.fishing.vo.FaqVO;


@Service
public class FaqServiceImpl implements FaqService {
	
	@Autowired
	private FaqDAO faqDAO;	

	public void insertFaqBoard(FaqVO faqVO) {
		faqDAO.insertFaqBoard(faqVO);
	}
	
	// FAQ 게시글 리스트 조회
	public List<FaqVO> getFaqBoardList(FaqVO faqVO) {
		return faqDAO.getFaqBoardList(faqVO);
	}
	
	// 글 수정
	public void updateFaqBoard(FaqVO faqVO) {
		faqDAO.updateFaqBoard(faqVO);
	}
	
	public FaqVO seleteFaqBoard(FaqVO faqVO) {
		return faqDAO.seleteFaqBoard(faqVO);
	}
	
	public void deleteFaqBoard(FaqVO faqVO) {
		faqDAO.deleteFaqBoard(faqVO);
		System.out.println("게시글 삭제");
	}
}
