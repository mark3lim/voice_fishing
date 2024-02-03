package kr.co.fishing.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.fishing.service.ImageService;
import kr.co.fishing.vo.ImageVO;

@Controller
public class ImageController {

	@Autowired
	private ImageService iService;
	
	@GetMapping("/image.do")
	public String mainPage(Model model) {
		model.addAttribute("images", iService.searchAllImg());
		
		return "image";
	}
	
	@PostMapping("/save_image.do")
	@ResponseBody
	public String saveImage(MultipartHttpServletRequest request) {
		int maxSize = 1024 * 1024 * 7;
		String[] extension = {"JPEG", "JPG", "GIF", "BMP", "PNG", "TIFF", "TIF"};
		boolean flag = false;
		String msg = "이미지 파일만 업로드 가능합니다.\n(\"JPEG\", \"JPG\", \"GIF\", \"BMP\", \"PNG\", \"TIFF\", \"TIF\")";
		
		MultipartFile file = request.getFile("imageFile");
		String fileName = file.getOriginalFilename();
		String fileExtension = fileName.substring(fileName.lastIndexOf(".")+1).toUpperCase();
		
		for(String fe : extension) {
			if(fe.equals(fileExtension)) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			if(file.getSize() > maxSize) {
				return "파일은 7MB을 초과할 수 없습니다.";
			}
			
			try {
				msg = iService.inputImage(new ImageVO("I000000", fileName, file.getBytes()));
				
			} catch (IOException e) {
				e.printStackTrace();
				return "서버 에러! 다시 시도해주세요.";
			}
			
		}
		
		return msg;
	}
}
