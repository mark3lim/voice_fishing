package kr.co.fishing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.fishing.vo.NoticeVO;



@Mapper
@Repository
public interface NoticeDAO {

	// 게시물 등록
	public void insertNotice(NoticeVO noticeVO);

	// 게시물 리스트 조회
	public List<NoticeVO> selectAllNotice(NoticeVO noticeVO);

	// 게시물 리스트 조회 (5개만)
	public List<NoticeVO> selectFiveNotice(NoticeVO noticeVO);

	// 글 상세조회
	public NoticeVO seleteNoticeBoard(NoticeVO noticeVO);

	// 게시물 수정
	public void updateNoticeBoard(NoticeVO noticeVO);

	// 글 삭제
	public void deleteNoticeBoard(NoticeVO noticeVO);

	// 다음 글 보기
	public List<NoticeVO> seleteNoticeNext(NoticeVO noticeVO);

	// 게시물 조회수 증가
	public void hitsplus(Integer product_number);

	// 게시물 개수
	public Integer selectCount(Integer count);

}
