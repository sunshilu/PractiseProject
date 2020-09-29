package cn.com.niit.javacoures.chapter01.view;

import cn.com.niit.javacoures.chapter01.model.Util;

public class MainView {
	private int width;
	private int height;
	private String title;
	Util u = new Util();

	public void displayMainView() {
		System.out.println("display main view");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static void main(String[] args) {
		new MainView().displayMainView();
	}

	public MainView() {
		super();
		new MainView(width, height);
	}

	public MainView(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "MainView [width=" + width + ", height=" + height + ", title=" + title + "]";
	}
}
