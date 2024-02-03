package kr.co.fishing.service;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fishing.dao.ImageDAO;
import kr.co.fishing.domain.ImageDomain;
import kr.co.fishing.vo.ImageVO;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageDAO iDAO;

	@Override
	public String inputImage(ImageVO iVO) {
		String msg = "이미지 저장 실패!";
		int result = iDAO.insertImg(iVO);
		
		if(result == 1 ) {
			msg = "이미지 저장에 성공!";
		}
		
		return msg;
	}

	@Override
	public String removeImage() {
		return null;
	}

	@Override
	public String changeImage() {
		return null;
	}

	@Override
	public List<ImageDomain> searchAllImg() {
		List<ImageDomain> list = iDAO.selectAll();
		//data:image/png;base64,
		for(ImageDomain domain : list) {
			domain.setBase64Photo("data:image/png;base64,"+Base64.encodeBase64String(domain.getPhotoInfo()));
		}
		
		return list;
	}

}
