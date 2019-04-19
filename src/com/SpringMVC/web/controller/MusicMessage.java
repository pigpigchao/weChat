package com.SpringMVC.web.controller;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("MusicMessage ")
public class MusicMessage extends BaseMessage{
    // 回复的消息内容  
    private String Content;  

//   @XStreamAlias("Content")
    public String getContent() {  
        return Content;  
    }  

    public void setContent(String content) {  
        Content = content;  
    }  
}