package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return ContentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ContentDto dto = (ContentDto)obj;
		
//		String sWriter = dto.getWriter();
//		if(sWriter == null || sWriter.trim().isEmpty()) {
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("writer", "trouble");
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "writer is empty or null");
		String sWriter = dto.getWriter();
		if(sWriter.length() < 3) {
			errors.rejectValue("writer", "writer is too short");
		}
		
//		String sContent = dto.getContent();
//		if(sContent == null || sContent.trim().isEmpty()) {
//			System.out.println("Content is null or empty");
//			errors.rejectValue("Content", "trouble");
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "content is empty or null");
	}
	
	
}
