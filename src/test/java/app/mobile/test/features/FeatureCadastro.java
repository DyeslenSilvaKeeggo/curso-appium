package app.mobile.test.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import app.mobile.test.AppiumDriverConfig;
import app.mobile.test.pageObject.CadastroPageObject;
import app.mobile.test.pageObject.LoginPageObject;
import io.appium.java_client.AppiumDriver;

public class FeatureCadastro {

	private CadastroPageObject cadastroPageObject;
	private LoginPageObject loginPageObject;
	
	@Test
	public void naoConsigoCadastrarUsuarioComSenhasDiferentes() throws MalformedURLException {
		AppiumDriver<WebElement> appiumDriverConfig = AppiumDriverConfig.instance().driver;
		
		loginPageObject = new LoginPageObject(appiumDriverConfig);
		loginPageObject.buscarElementos();
		CadastroPageObject cadastro =    loginPageObject.irParaTelaDeCadastro();
		cadastro.buscarElementos();
		cadastro.cadastrar("dyeslen", "1234", "5678");
		assertEquals("Senhas nao conferem", cadastroPageObject.mensagemErro());
		appiumDriverConfig.navigate().back();
	}
	
	@Test
	public void possoCadastrarUsuarioComSenhasQueConferem() throws MalformedURLException {
		AppiumDriver<WebElement> appiumDriverConfig = AppiumDriverConfig.instance().driver;
		
		LoginPageObject loginPageObject = new LoginPageObject(appiumDriverConfig);
		loginPageObject.buscarElementos();
		CadastroPageObject cadastro = loginPageObject.irParaTelaDeCadastro();
		cadastro.buscarElementos();
		cadastro.cadastrar("dyeslen", "123", "123");
		loginPageObject.buscarElementos();
	}

}
																																																																																																																																	