package kr.co.fishing.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ImageVO {

	
	private String postId, imageName;
	private byte[] photoInfo;
	
	
}
