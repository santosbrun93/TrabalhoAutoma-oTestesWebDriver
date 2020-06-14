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

import pages.ExcluirPages;

public class ExcluiTeste {


		//instanciando classe webdriver
		static WebDriver driver;
		
		//instanciando classe Excluir pages
		static ExcluirPages ExcluirPages;

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
			//caminho do webdriver chrome
			System.setProperty("webdriver.chrome", "C:/chromedrive.exe");
			
			//setar propriedade para n�o aparecer os "erros amigos" no debug output.
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			
			//instancia o driver do navegador Chrome
			driver = new ChromeDriver();
			
			//abre o seguinte endere�o no navegador
			driver.get("http://demo.automationtesting.in/WebTable.html");
			
			//instancia a page preparada para excluir um elemento
			ExcluirPages = new ExcluirPages(driver);
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
		
			//modal para excluir primeiro registro
			ExcluirPages.modalExcluir();	
		}

	}
