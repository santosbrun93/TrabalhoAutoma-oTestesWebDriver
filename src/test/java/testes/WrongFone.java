package testes;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroWrongFone;

public class WrongFone {
		
		//instanciando classe webdriver
		static WebDriver driver;
		
		//instanciando classe Para Teste Fone
		static CadastroWrongFone CadastroWrongFone;

		
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		//caminho do webdriver chrome
			System.setProperty("webdriver.chrome", "C:/chromedrive.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			CadastroWrongFone = new CadastroWrongFone(driver);
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
			
			CadastroWrongFone.preencherCamposCad();
			
			CadastroWrongFone.comboBoxesSelect();

			CadastroWrongFone.comboDateSelect();
			
			CadastroWrongFone.preencherCamposSenha();

			assertEquals(CadastroWrongFone.ValidarMensagemFone() , "Phone number already exists");
		}
	}
