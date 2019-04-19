package com.SpringMVC.web.controller;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("NewsMessage ")
public class NewsMessage extends BaseMessage{
    // 回复的消息内容  
    @XStreamAlias("Content")
    private String Content;  

    public String getContent() {  
        return Content;  
    }  

    public void setContent(String content) {  
        Content = content;  
    }  
}