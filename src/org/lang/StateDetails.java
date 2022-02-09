package org.lang;

public class StateDetails {
	private void southindia() {
		System.out.println("I am from southindia");
	}
	private void northindia() {
		System.out.println("I am from northindia");
	}
	public static void main(String[] args) {
		StateDetails s=new StateDetails();
		s.southindia();
		s.northindia();
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.teluguLanguage();
		l.englishLanguage();
		Food f=new Food();
		f.food1();
		f.food2();
	}
	

}
