package kr.co.fishing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;
import kr.co.fishing.domain.ImageDomain;
import kr.co.fishing.vo.ImageVO;


@Mapper
@Resource
public interface ImageDAO {

	/**
	 * 이미지를 데이터베이스에 저장
	 * @param iVO
	 * @return int
	 */
	public int insertImg(ImageVO iVO);
	
	/**
	 * 데이터베이스에 있는 이미지를 불러온다.
	 * @return List<ImageDomain>
	 */
	public List<ImageDomain> selectAll();
}
