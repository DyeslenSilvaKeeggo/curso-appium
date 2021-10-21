package app.mobile.test.pageObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPageObject {

	private MobileElement botaoCadastro;
	private AppiumDriver<WebElement> appiumDriver;
 	
	
	public LoginPageObject(AppiumDriver<WebElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
	}
	
	
	public void buscarElementos() {
		botaoCadastro = (MobileElement) appiumDriver.findElementById("");
	}


	public CadastroPageObject irParaTelaDeCadastro() {
		botaoCadastro.click();
		return new CadastroPageObject(appiumDriver);
	}
	
}
