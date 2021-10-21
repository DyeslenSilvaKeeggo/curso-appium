package app.mobile.test.pageObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public abstract class PageObject {
	
	protected final AppiumDriver<WebElement> appiumDriver;
	
	public PageObject(AppiumDriver< WebElement>  appiumDriver) {
		this.appiumDriver = appiumDriver;
	}
	
	public abstract void buscarElementos();
}
