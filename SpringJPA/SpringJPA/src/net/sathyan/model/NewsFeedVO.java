package net.sathyan.model;

import org.springframework.stereotype.Component;


public class NewsFeedVO {
	private Long id;
	private String content;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public NewsFeedVO(Long id, String content) {
		super();
		this.id = id;
		this.content = content;
	};
	
	
}

