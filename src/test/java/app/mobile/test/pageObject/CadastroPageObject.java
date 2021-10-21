package app.mobile.test.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;

public class CadastroPageObject extends PageObject{
	
	//private AppiumDriverConfig appiumDriverConfig;
	private MobileElement campoNome;
	private MobileElement campoSenha;
	private MobileElement campoConfirmaSenha;
	private MobileElement botaoCadastrar;
	private MobileElement mensagemErro;
	//private AppiumDriver<WebElement>  appiumDriver;

	public CadastroPageObject(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
	}
	@Override
	public void buscarElementos() {
		campoNome = (MobileElement) appiumDriver.findElementById("");
		campoSenha = (MobileElement) appiumDriver.findElementById("");
		campoConfirmaSenha = (MobileElement) appiumDriver.findElementById("");
	}
	
	//@SuppressWarnings("unused")
	private  void preencherFormulario(String usuario, String senha, String confirmacao) {
		campoNome.setValue(usuario);
		campoSenha.setValue(senha);
		campoConfirmaSenha.setValue(confirmacao);
	}
	
	public LoginPageObject cadastrar(String usuario, String senha, String confirmacao) {
		preencherFormulario(usuario, senha, confirmacao);
		botaoCadastrar.click();
		return new LoginPageObject(appiumDriver);
	}
	
	public String mensagemErro() {
		WebDriverWait driverWait = new WebDriverWait(appiumDriver,4);
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		mensagemErro = (MobileElement) appiumDriver.findElementById("");
		return mensagemErro.getText();
	}
}
