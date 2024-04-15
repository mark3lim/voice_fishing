package kr.co.fishing.service.impl;



import java.util.List;

import kr.co.fishing.domain.FaqDomain;
import kr.co.fishing.service.FaqService;

import kr.co.fishing.dao.FaqDAO;
import kr.co.fishing.vo.FaqVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FaqServiceImpl implements FaqService {
	
	@Autowired
	private FaqDAO faqDAO;

	public void insertFaqBoard(FaqVO faqVO) {
		faqDAO.insertFaqBoard(faqVO);
	}
	
	// FAQ 게시글 리스트 조회
	public List<FaqDomain> getFaqBoardList() {
		return faqDAO.getFaqBoardList();
	}
	
	// 글 수정
	public void updateFaqBoard(FaqVO faqVO) {
		faqDAO.updateFaqBoard(faqVO);
	}
	
	public void deleteFaqBoard(int faqId) {
		faqDAO.deleteFaqBoard(faqId);
		System.out.println("게시글 삭제");
	}

}
