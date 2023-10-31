package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import common.TestBase;

public class Child extends Parent {
	int a=0;
			
	@Override
	public void test() {
		System.out.println(a+1);
	}
	
	
	public static void main(String args[]) {
		Parent p = new Parent();
		p.test();
		Parent p1 = new Child();
		p1.test();
	
	}
	

}
