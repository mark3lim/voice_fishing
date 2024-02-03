package kr.co.fishing.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;
import kr.co.fishing.vo.FaqVO;


@Mapper
@Resource
public interface FaqDAO {

	// 게시물 등록
	public void insertFaqBoard(FaqVO faqVO);	

	// 게시물 리스트 조회
	public List<FaqVO> getFaqBoardList(FaqVO faqVO);
	
	// 게시물 수정
	public void updateFaqBoard(FaqVO faqVO);	
	
	//글 상세조회
	public FaqVO seleteFaqBoard(FaqVO faqVO);
	
	//글 삭제
	public void deleteFaqBoard(FaqVO faqVO);
	
}
