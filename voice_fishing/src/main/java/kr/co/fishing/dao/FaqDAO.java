package kr.co.fishing.dao;



import java.util.List;

import jakarta.annotation.Resource;
import kr.co.fishing.domain.FaqDetailDomain;
import kr.co.fishing.domain.FaqDomain;
import kr.co.fishing.vo.FaqVO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
@Resource
public interface FaqDAO {

	// 게시물 등록
	public void insertFaqBoard(FaqVO faqVO);

	// 게시물 리스트 조회
	public List<FaqDomain> getFaqBoardList();

	// 게시물 수정
	public void updateFaqBoard(FaqVO faqVO);

	//글 상세조회
	public FaqDetailDomain selectFaqBoard(int faqId);

	//글 삭제
	public void deleteFaqBoard(int faqId);

}
