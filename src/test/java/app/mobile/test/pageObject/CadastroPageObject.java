package app.mobile.test.pageObject;

import org.openqa.selenium.WebElement;

import app.mobile.test.AppiumDriverConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class CadastroPageObject {
	
	//private AppiumDriverConfig appiumDriverConfig;
	private MobileElement campoNome;
	private MobileElement campoSenha;
	private MobileElement campoConfirmaSenha;
	private MobileElement botaoCadastrar;
	private MobileElement mensagemErro;
	private AppiumDriver<WebElement>  appiumDriver;

	public CadastroPageObject(AppiumDriver<WebElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
	}
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
	
	public void cadastrar(String usuario, String senha, String confirmacao) {
		preencherFormulario(usuario, senha, confirmacao);
		botaoCadastrar.click();
	}
	
	public String mensagemErro() {
		mensagemErro = (MobileElement) appiumDriver.findElementById("");
		return mensagemErro.getText();
	}
}
