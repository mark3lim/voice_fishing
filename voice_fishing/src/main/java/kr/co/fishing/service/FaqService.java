package kr.co.fishing.service;



import java.util.List;

import kr.co.fishing.domain.FaqDetailDomain;
import kr.co.fishing.domain.FaqDomain;
import kr.co.fishing.vo.FaqVO;

public interface FaqService {

	// 게시물 등록
	public void insertFaqBoard(FaqVO faqvo);
	
	// 게시물 리스트 조회
	List<FaqDomain> getFaqBoardList();
	
	// 게시물 수정
	public void updateFaqBoard(FaqVO faqvo);
	
	// 게시글 상세 조회
	public FaqDetailDomain selectFaqBoard(int faqId);
	
	// 게시글 삭제
	public void deleteFaqBoard(int faqId);
	
	
}
