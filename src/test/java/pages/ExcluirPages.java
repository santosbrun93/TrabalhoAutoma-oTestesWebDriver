package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcluirPages {
	
	
	
	static WebDriver driver;
	
	public ExcluirPages(WebDriver driver) {
		this.driver = driver;
	}

	
	public void modalExcluir () {
		
		//waitinho da amizade
		WebDriverWait waitTable = new WebDriverWait(driver,8);
			waitTable.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/del-click[1]/button[1]")));		
		
		//instancia uma action
		Actions actions = new Actions(driver);
			
		//localiza o elemento do delete sem ser o icone de lixeira
			WebElement elementLocator = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/del-click[1]/button[1]"));
		//chama o métolo de click de context permitindo clicar com o botão direito.
			actions.contextClick(elementLocator).perform();
		
		WebDriverWait waitBt = new WebDriverWait(driver,1);
			waitBt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div[6]/user-click-select/div[1]/div/ul/li[1]/button")));		
		//localiza o elemento do "Delete"
		WebElement deleteClick = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div[6]/user-click-select/div[1]/div/ul/li[1]/button"));
		
		//passalhe o click nele
			deleteClick.click();
		//configura o webDriver pra aceitar de forma automática os notification alerts
			driver.switchTo().alert().accept();
			
		WebDriverWait waitTableFinish = new WebDriverWait(driver,10);
			waitTableFinish.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/del-click[1]/button[1]")));		
			
		}
}
