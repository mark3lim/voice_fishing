package kr.co.fishing.service;

import java.util.List;

import kr.co.fishing.vo.NoticeVO;


public interface NoticeService {

	public void insertNotice(NoticeVO noticeVO);

	public List<NoticeVO> selectAllNotice(NoticeVO noticeVO);

	public List<NoticeVO> selectFiveNotice(NoticeVO noticeVO);

	public NoticeVO seleteNoticeBoard(NoticeVO noticeVO);

	public void updateNoticeBoard(NoticeVO noticeVO);

	public void deleteNoticeBoard(NoticeVO noticeVO);

	public List<NoticeVO> seleteNoticeNext(NoticeVO noticeVO);

	public void hitsplus(Integer product_number);




}
