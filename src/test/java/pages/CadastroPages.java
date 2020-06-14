package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPages {
	
	
	static WebDriver driver;
	
	public CadastroPages(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void preencherCamposEmail() {
		
		WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("admin@gmail.com");
		
		WebDriverWait waitBt = new WebDriverWait(driver,1);
			waitBt.until(ExpectedConditions.visibilityOfElementLocated(By.id("enterimg")));		
			
		WebElement submit1 = driver.findElement(By.id("enterimg"));
			submit1.click();
	}
	
	
	public void preencherCamposCad() {
		
		WebElement firstname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
			firstname.sendKeys("Faculdade");
		
		WebElement lastname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
			lastname.sendKeys("Fadergs");
		
		WebDriverWait waitNext = new WebDriverWait(driver,2);
			waitNext.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")));	
			
		WebElement adress = driver.findElement(By.tagName("textarea"));
			adress.sendKeys("R. Riachuelo, 1257");
														
		WebElement email = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
			email.sendKeys("admin@fadergs.edu.br");
			
		WebDriverWait waitMail = new WebDriverWait(driver,2);
			waitMail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")));		
			
		WebElement phone = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]"));
			phone.sendKeys("0007678678");

		WebDriverWait waitBt = new WebDriverWait(driver,3);
			waitBt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")));		
			
		WebElement gender = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
			gender.click();	
			
		WebElement hobbies = driver.findElement(By.id("checkbox1"));
			hobbies.click();	
		
		WebElement langClick = driver.findElement(By.id("msdd"));
			langClick.click();
			
		//WebDriverWait holdUpTwo = new WebDriverWait(driver, 6);
		//	holdUpTwo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Arabic')]")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();
	}
	
	
	public void comboBoxesSelect(){

	WebDriverWait waitSkill = new WebDriverWait(driver,1);
		waitSkill.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skills")));		
		
	Select selectSkill = new Select (driver.findElement(By.id("Skills")));
		selectSkill.selectByVisibleText("Java");		
		
	Select selectCountry = new Select (driver.findElement(By.id("countries")));
		selectCountry.selectByValue("Brazil");	
		
	WebElement selectCountry2 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
		selectCountry2.click();
		
	WebDriverWait holdUpToo = new WebDriverWait(driver, 6);
		holdUpToo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")));
	
	driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[7]")).click();	
	} 
		
	
	public void comboDateSelect() {	
		
	Select selectYear = new Select (driver.findElement(By.id("yearbox")));
		selectYear.selectByVisibleText("1986");
		
	Select selectMonth = new Select (driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
		selectMonth.selectByVisibleText("June");
		
	Select selectDay = new Select (driver.findElement(By.id("daybox")));
		selectDay.selectByValue("4");
	}
	
	
	public void preencherCamposSenha() {
	
	WebElement password = driver.findElement(By.id("firstpassword"));
		password.sendKeys("C84jcjDVpcH@w7E");
		
	WebElement confirmPass = driver.findElement(By.id("secondpassword"));
		confirmPass.sendKeys("C84jcjDVpcH@w7E");
		
	WebDriverWait waitBt1 = new WebDriverWait(driver,2);
		waitBt1.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitbtn")));		
		
	WebElement submitbtt = driver.findElement(By.id("submitbtn"));
		submitbtt.click();;	
	}
	
}
