package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component // <컴포넌트가 Data를 빈으로 만들어줌
@Data
public class ImageDTO {
	private String imgseq; //이미지번호
	private String imgName;
	private String extension;
	private String userid;
}
