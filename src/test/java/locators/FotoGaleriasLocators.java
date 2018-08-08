package locators;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class FotoGaleriasLocators {
	
	@FindBy(css = "button[id='onesignal-popover-cancel-button']")
	protected WebElement popCancel;
	
	//Area Recomendadas
	@FindBy(css = "ul[class='recommended']") 
	protected WebElement houverRecomendadas;
	
	@FindBys({@FindBy(css = "ul[class='recommended']"), @FindBy(tagName = "li")})
	protected List<WebElement> areaRecomendadas;	 
	
	//Area Mais Vistas
	@FindBy(css = "div[class='popular']")
	protected WebElement houverMaisVistas;
	@FindBys({@FindBy(css = "div[class='popular']"),
	          @FindBy(tagName = "li")
	         })
	protected List<WebElement> areaMaisVistas;
	
	//Area Ulltima de
	protected WebElement selectEditorias;
		
	@FindBys({@FindBy(id = "lastFrom"),
			  @FindBy(tagName = "li")
	          })	
	protected List<WebElement> aeraUltimade;
}
