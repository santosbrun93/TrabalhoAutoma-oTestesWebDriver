package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroWrongFone {
	
	static WebDriver driver;
	
	
	public CadastroWrongFone(WebDriver driver) {
		this.driver = driver;
		}
		
		
		public void preencherCamposCad() {
			
			//wait para garantir elementos carregados
			WebDriverWait waitNext = new WebDriverWait(driver,2);
			
			//localizar elemento primeiro nome
			WebElement firstname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
				//inserir o valor no campo
				firstname.sendKeys("Bruno");
			
			WebDriverWait waitNext1 = new WebDriverWait(driver,2);
			
			//localizar elemento último nome
			WebElement lastname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
				//inserir o valor no campo
				lastname.sendKeys("Silva");
			
			WebDriverWait waitNext2 = new WebDriverWait(driver,2);
					
			//localizar elemento inserir endereço
			WebElement adress = driver.findElement(By.tagName("textarea"));
				//inserir o valor no campo
				adress.sendKeys("Av. Manoel Elias, 1257");
				
			WebDriverWait waitNext3 = new WebDriverWait(driver,2);
			
			//localizar elemento email
			WebElement email = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
				//inserir o valor no campo
				email.sendKeys("admin@fadergs.edu.br");
				
			WebDriverWait waitMail = new WebDriverWait(driver,2);
				waitMail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")));		
			
			//localizar elemento telefone
			WebElement phone = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]"));
				//inserir o valor no campo
				phone.sendKeys("0007678678");

			WebDriverWait waitBt = new WebDriverWait(driver,3);
				waitBt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")));		
				
			//localizar elemento gênero 
			WebElement gender = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
				//clicar na opção desejada
				gender.click();	
				
			//localiza na opção desejada
			WebElement hobbies = driver.findElement(By.id("checkbox1"));
				//clicar na opção desejada
				hobbies.click();	
			
			//localiza o elemento da lista DropDown 
			WebElement langClick = driver.findElement(By.id("msdd"));
				//clicar no dropdown para abrir lista
				langClick.click();
				
			WebDriverWait holdUpTwo = new WebDriverWait(driver,3);
					
			//clicar no idioma desejado	
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();
			
			WebDriverWait waitValidation = new WebDriverWait(driver,3);	
		}
		
		
		public void comboBoxesSelect(){

		WebDriverWait waitSkill = new WebDriverWait(driver,1);
			waitSkill.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skills")));		
		
			
		//instancia um select com o elemento lista Skills
		Select selectSkill = new Select (driver.findElement(By.id("Skills")));
			selectSkill.selectByVisibleText("Java");		
			
		//instancia um select com o elemento lista countries	
		Select selectCountry = new Select (driver.findElement(By.id("countries")));
			selectCountry.selectByValue("Brazil");	
		
		//instancia um select com o elemento lista second countries
		WebElement selectCountry2 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
			selectCountry2.click();
			
		WebDriverWait holdUpToo = new WebDriverWait(driver, 6);
			holdUpToo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")));
		
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[7]")).click();	
		
		} 
		
		
		public void comboDateSelect() {	
		
		//instancia um select com o elemento lista anos
		Select selectYear = new Select (driver.findElement(By.id("yearbox")));
			//seleciona pelo texto vísivel
			selectYear.selectByVisibleText("1993");
			
		//instancia um select com o elemento lista meses
		Select selectMonth = new Select (driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
			//seleciona pelo texto vísivel
			selectMonth.selectByVisibleText("December");
			
		//instancia um select com o elemento lista dias
		Select selectDay = new Select (driver.findElement(By.id("daybox")));
			//seleciona pelo valor atribuído na tag
			selectDay.selectByValue("7");
		}
		
		
		public void preencherCamposSenha() {
		
		WebElement password = driver.findElement(By.id("firstpassword"));
			password.sendKeys("C84jcjDVpcH@w7E");
			
		WebElement confirmPass = driver.findElement(By.id("secondpassword"));
			confirmPass.sendKeys("C84jcjDVpcH@w7E");
			
		WebDriverWait waitBt1 = new WebDriverWait(driver,2);
			waitBt1.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitbtn")));		
			
		WebElement submitbtt = driver.findElement(By.id("submitbtn"));
			submitbtt.click();
			
		WebDriverWait waitToFinish = new WebDriverWait(driver,10);
			waitToFinish.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]")));
		}

		
		public String ValidarMensagemFone() {
			return driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]")).getText();
		}
}
