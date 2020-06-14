package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import pages.*;

public class CadastroChrome {
	
	
	//instanciando classe webdriver
	static WebDriver driver;
	//instanciando classe Cadastro pages
	static CadastroPages CadastroPages;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		//caminho do webdriver chrome
		System.setProperty("webdriver.chrome", "C:/chromedrive.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		CadastroPages = new CadastroPages(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//fechar navegador
		driver.quit();
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		CadastroPages.preencherCamposEmail();
		
		CadastroPages.preencherCamposCad();
				
		CadastroPages.comboBoxesSelect();
		
		CadastroPages.comboDateSelect();
		
		CadastroPages.preencherCamposSenha();
		
	}

}
