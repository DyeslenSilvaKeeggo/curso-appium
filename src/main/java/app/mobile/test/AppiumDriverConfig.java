package app.mobile.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumDriverConfig {
	public final AppiumDriver<WebElement> driver;
	private static AppiumDriverConfig _instance;
	
	public static AppiumDriverConfig instance() {
		if(AppiumDriverConfig._instance == null) {
			AppiumDriverConfig._instance = new AppiumDriverConfig();
		}
		return AppiumDriverConfig._instance;
	}
	
	public AppiumDriverConfig()  {
		File apk = new File("/appium-project-testes/src/main/resources/resources/alura_esporte.apk");
		
		DesiredCapabilities configuracoes = new DesiredCapabilities();
		configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		URL urlConexao = null;
		
		try {
			urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new AppiumDriver<WebElement>(urlConexao,configuracoes);
	}
}
