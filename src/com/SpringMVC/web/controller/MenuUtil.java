package com.SpringMVC.web.controller;

import com.SpringMVC.web.menu.Button;
import com.SpringMVC.web.menu.ClickButton;
import com.SpringMVC.web.menu.Menu;
import com.SpringMVC.web.menu.ViewButton;

public class MenuUtil {
	
	public static Menu initMenu(){

		Menu menu = new Menu();

		ClickButton button11 = new ClickButton();

		button11.setName("点击事件11");

		button11.setType("click");

		button11.setKey("11");

		 

		ClickButton button12 = new ClickButton();

		button12.setName("点击事件12");

		button12.setType("click");

		button12.setKey("12");

		 

		ViewButton button21 = new ViewButton();

		button21.setName("跳转URL");

		button21.setType("view");

		button21.setUrl("https://www.baidu.com");

		 

		ViewButton button22 = new ViewButton();

		button22.setName("跳转URL2");

		button22.setType("view");

		button22.setUrl("https://www.jd.com");

		 

		ClickButton button31 = new ClickButton();

		button31.setName("测试");

		button31.setType("click");

		button31.setKey("31");

		 

		Button button1 = new Button();

		button1.setName("测试菜单"); //将11/12两个button作为二级菜单封装第一个一级菜单

		button1.setSub_button(new Button[]{button11,button12});

		 

		Button button2 = new Button();

		button2.setName("相关网址"); //将21/22两个button作为二级菜单封装第二个二级菜单

		button2.setSub_button(new Button[]{button11,button12});

		 

		menu.setButton(new Button[]{button1,button2,button31});// 将31Button直接作为一级菜单

		return menu;

		}

}
