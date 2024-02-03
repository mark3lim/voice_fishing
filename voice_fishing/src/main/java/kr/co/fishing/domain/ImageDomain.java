package kr.co.fishing.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ImageDomain {

	private String postId, imageName, base64Photo;
	private byte[] photoInfo;
}
