package kr.co.fishing.service;

import java.util.List;

import kr.co.fishing.domain.ImageDomain;
import kr.co.fishing.vo.ImageVO;

public interface ImageService {

	/**
	 * 이미지를 데이터베이스에 저장하는 메소드
	 * @param iVO
	 * @return String 결과 메시지를 반환
	 */
	public String inputImage(ImageVO iVO);
	
	/**
	 * 이미지를 데이터베이스에서 삭제하는 메서드
	 * @return String 결과 메시지를 반환
	 */
	public String removeImage();
	
	/**
	 * 이미지 정보를 데이터베이스에 수정하는 메서드
	 * @return String 결과 메시지를 반환
	 */
	public String changeImage();
	
	/**
	 * 데이터베이스에 있는 모든 사진 정보를 가져온다.
	 * @return List<ImageDomain>
	 */
	public List<ImageDomain> searchAllImg();
}
