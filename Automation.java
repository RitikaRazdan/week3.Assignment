package week3.homeAssignment;

/*
 * Assignment 5 on Abstraction
===========
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
 */

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Test tool is Selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Language is Java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Language is Ruby");
		
	}

	public static void main(String[] args) {
		Automation myAuto= new Automation();
		myAuto.Java();
		myAuto.Selenium();
		myAuto.python();
		myAuto.ruby();
		
	}
	
	
}
