package cn.com.niit.javacoures.chapter01;

import cn.com.niit.javacoures.chapter01.model.Util;
import cn.com.niit.javacoures.chapter01.view.MainView;

public class MainClass {
	Util u = new Util();

	public static void main(String[] args) {
		MainView mv1 = new MainView();
		MainView mv2 = new MainView(100, 200);
		System.out.println(mv1.toString());
		System.out.println(mv2.toString());
	}
}
