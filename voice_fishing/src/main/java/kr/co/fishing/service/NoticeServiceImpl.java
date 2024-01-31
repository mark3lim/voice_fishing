package kr.co.fishing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fishing.dao.NoticeDAO;
import kr.co.fishing.vo.NoticeVO;



@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	// 게시글 등록
	public void insertNotice(NoticeVO noticeVO) {
		noticeDAO.insertNotice(noticeVO);
	}
	
	// 게시글 목록 
	public List<NoticeVO> selectAllNotice(NoticeVO noticeVO) {
		System.out.println(noticeVO.toString());
		return noticeDAO.selectAllNotice(noticeVO);
	}
	
	// 게시글 5개 목록
	public List<NoticeVO> selectFiveNotice(NoticeVO noticeVO) {
		System.out.println(noticeVO.toString());
		return noticeDAO.selectFiveNotice(noticeVO);
	}
	
	// 게시글 상세 보기
	public NoticeVO seleteNoticeBoard(NoticeVO noticeVO) {
		return noticeDAO.seleteNoticeBoard(noticeVO);
	}
	
	// 게시글 수정
	public void updateNoticeBoard(NoticeVO noticeVO) {
		noticeDAO.updateNoticeBoard(noticeVO);
	}
	
	
	// 게시글 삭제
	public void deleteNoticeBoard(NoticeVO noticeVO) {
		noticeDAO.deleteNoticeBoard(noticeVO);
	}
	
	// 게시글 다음글 선택
	public List<NoticeVO> seleteNoticeNext(NoticeVO noticeVO) {
		return noticeDAO.seleteNoticeNext(noticeVO);
	}
	
	// 게시글 조회수 높은거
	public void hitsplus(Integer product_number) {
		noticeDAO.hitsplus(product_number);
	}
	


	
}
