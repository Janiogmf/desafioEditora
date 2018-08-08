package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.FotoGaleriasLocators;
import system.TestRule;

public class FotoGaleriasPage extends FotoGaleriasLocators {
	public FotoGaleriasPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	Actions hover = new Actions(TestRule.getDriver());
	WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
	
	public boolean Recomendadas(int numFotosRecomendadas) throws InterruptedException {	
		TestRule.getDriver().manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);		
		wait.until(ExpectedConditions.visibilityOf(popCancel));
		popCancel.click();
//		hover.moveToElement(houverRecomendadas).build().perform();			
		if(areaRecomendadas.size() == numFotosRecomendadas) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean MaisVistas(int valorMaisVistos) {
		hover.moveToElement(houverMaisVistas).build().perform();
		if(areaMaisVistas.size() == valorMaisVistos) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean validarSelecao(String valorDefaut) {
		Select txtSelecao = new Select(selectEditorias);
		String textFirstOptions = txtSelecao.getFirstSelectedOption().getText();
		if(textFirstOptions.contains(valorDefaut)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void selectUltimas(String nameSelect) {
		Select txtSelecao = new Select(selectEditorias);
		txtSelecao.selectByVisibleText(nameSelect);
	}
	
	public boolean Ultima_de(int valorUltima) {
//		hover.moveToElement(selectEditorias).build().perform();
		if(aeraUltimade.size() == valorUltima) {
			return true;
		}else {
			return false;
		}
	}
}
