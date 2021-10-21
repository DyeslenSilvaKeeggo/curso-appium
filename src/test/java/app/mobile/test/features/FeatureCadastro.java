package app.mobile.test.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import app.mobile.test.AppiumDriverConfig;
import app.mobile.test.pageObject.CadastroPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FeatureCadastro {

	private CadastroPageObject cadastroPageObject;
	
	@Test
	public void naoConsigoCadastrarUsuarioComSenhasDiferentes() throws MalformedURLException {
		AppiumDriver<WebElement> appiumDriverConfig = AppiumDriverConfig.instance().driver;
		MobileElement botaoCadastro =    (MobileElement) appiumDriverConfig.findElement(By.id(""));
		botaoCadastro.click();
		
		cadastroPageObject = new CadastroPageObject(appiumDriverConfig);
		cadastroPageObject.cadastrar("dyeslen", "1234", "5678");
		assertEquals("Senhas nao conferem", cadastroPageObject.mensagemErro());
		appiumDriverConfig.navigate().back();
	}
	
	@Test
	public void possoCadastrarUsuarioComSenhasQueConferem() throws MalformedURLException {
		AppiumDriver<WebElement> appiumDriverConfig = AppiumDriverConfig.instance().driver;
		MobileElement botaoCadastro =    (MobileElement) appiumDriverConfig.findElement(By.id(""));
		botaoCadastro.click();
		
		cadastroPageObject = new CadastroPageObject(appiumDriverConfig);
		cadastroPageObject.buscarElementos();
		cadastroPageObject.cadastrar("dyeslen", "123", "123");
		
		MobileElement botaoLogar = (MobileElement) appiumDriverConfig.findElementById("");
	}

}
																																																																																																																																	