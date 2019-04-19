package com.SpringMVC.web.controller;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TextMessage")
// @XStreamAlias("xml")
public class TextMessage extends BaseMessage {
	// 回复的消息内容
	@XStreamAlias("Content")
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTextMessage [Content=" + Content + "]";
	}

}
